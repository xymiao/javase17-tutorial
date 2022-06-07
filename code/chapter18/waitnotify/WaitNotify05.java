import java.util.concurrent.TimeUnit;

public class WaitNotify05 {
    public String s = "wait";

    public static void main(String[] args) throws InterruptedException {
        WaitNotify05 waitNotify05 = new WaitNotify05();
        ThreadA threadA = new ThreadA(waitNotify05);
        threadA.start();
        TimeUnit.SECONDS.sleep(3);

        ThreadB threadB = new ThreadB(waitNotify05);
        threadB.start();
    }
}

class ThreadA extends Thread {
    private WaitNotify05 waitNotify05;

    public ThreadA(WaitNotify05 waitNotify05) {
        this.waitNotify05 = waitNotify05;
    }

    @Override
    public void run() {
        try {
            synchronized (waitNotify05) {
                System.out.println(Thread.currentThread().getName() + " s = " + waitNotify05.s);
                System.out.println(Thread.currentThread().getName() + " wait 开始" + System.currentTimeMillis());
                waitNotify05.wait();
                System.out.println(Thread.currentThread().getName() + " wait 结束" + System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName() + " s = " + waitNotify05.s);
            }

        } catch (Exception e) {
        }
    }
}

class ThreadB extends Thread {
    private WaitNotify05 waitNotify05;

    public ThreadB(WaitNotify05 waitNotify05) {
        this.waitNotify05 = waitNotify05;
    }

    @Override
    public void run() {
        synchronized (waitNotify05) {
            System.out.println(Thread.currentThread().getName() + " notify 开始" + System.currentTimeMillis());
            waitNotify05.s = "notify()";
            waitNotify05.notify();
            System.out.println(Thread.currentThread().getName() + " notify 结束" + System.currentTimeMillis());
        }
    }
}