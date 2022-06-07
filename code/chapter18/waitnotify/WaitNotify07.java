import java.util.concurrent.TimeUnit;

public class WaitNotify07 {
    public static void main(String[] args) throws InterruptedException{
        WaitNotify07 waitNotify07 = new WaitNotify07();
        ThreadA threadA = new ThreadA(waitNotify07);
        threadA.start();
        TimeUnit.SECONDS.sleep(3);
        threadA.interrupt();
    }
}

class ThreadA extends Thread {
    private WaitNotify07 waitNotify07;
    public ThreadA(WaitNotify07 waitNotify07) {
        this.waitNotify07 = waitNotify07;
    }
    @Override
    public void run() {
        try {
            synchronized (waitNotify07) {
              System.out.println("ThreadA 开始 wait" );
              waitNotify07.wait();
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
