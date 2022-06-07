import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitNotify08 {
    public static void main(String[] args) throws InterruptedException{
        Send send = new Send();
        ThreadB threadB1 = new ThreadB(send);
        threadB1.start();

        ThreadA threadA = new ThreadA(send);
        ThreadB threadB = new ThreadB(send);
        threadB.start();
        threadA.start();
    }
}
class Send {
    private volatile List<String> sendList = new ArrayList<>();
    public void add() {
        sendList.add("18500000001");
    }
    public int size() {
        return sendList.size();
    }
}
class ThreadA extends Thread {
    private Send send;
    public ThreadA(Send send) {
        this.send = send;
    }
    @Override
    public void run() {
        try {
            synchronized (send) {
                for (int i = 1; i <= 10; i++) {
                    send.add();
                    if (send.size() == 8) {
                        System.out.println("发起 notify 通知");
                        send.notify(); //虽然调用了， 但是会等待着这次的 同步锁解锁才能运行 ThreadB 
                    }
                    System.out.println("添加了 " + i + " 个元素");
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class ThreadB extends Thread {
    private Send send;
    public ThreadB(Send send) {
        this.send = send;
    }
    @Override
    public void run() {
        try {
            synchronized (send) {
                if (send.size() != 8) {
                    System.out.println(Thread.currentThread().getName() + " 开始运行了");
                    send.wait();
                    System.out.println("send 的发送数据已经够 8 个了。");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
