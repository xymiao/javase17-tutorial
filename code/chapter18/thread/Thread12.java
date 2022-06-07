import java.util.concurrent.TimeUnit;

public class Thread12 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().isDaemon());
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        // 这里等待 1 秒钟，是为了更好的查看守护线程的生命周期。
        // 要不然太快的结束主线程，新启动的线程就还没有启动起来也就看不到效果了
        TimeUnit.SECONDS.sleep(1); 
        System.out.println(Thread.currentThread().getName() +  "线程结束, 守护线程也会结束。"); 
    }
}

class DaemonThread extends Thread {

    @Override
    public void run() {
        int index = 0;
        System.out.println("是否是守护线程: " + this.isDaemon());
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println(++index);
            }
        } catch (InterruptedException e) {

        }
    }
}
