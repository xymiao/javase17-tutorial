import java.util.concurrent.TimeUnit;

public class Thread13 {
    public static void main(String[] args)  {
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().isDaemon());
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.start();
        daemonThread.setDaemon(true);
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
