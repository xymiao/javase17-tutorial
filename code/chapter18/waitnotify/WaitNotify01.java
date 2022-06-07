import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitNotify01 {
    public static void main(String[] args) {
        Send send = new Send();
        ThreadA threadA = new ThreadA(send);
        ThreadB threadB = new ThreadB(send);
        threadA.start();
        threadB.start();
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
            for (int i = 1; i <= 10; i++) {
                send.add();
                System.out.println("添加了 " + i + " 个元素");
                TimeUnit.SECONDS.sleep(1);
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
            while (true) {
                if (send.size() == 8) {
                    System.out.println("send 的发送数据已经够 8 个了。准备发送数据。");
                    throw new InterruptedException("为了退出 while 循环，抛个异常玩玩。");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
