import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Volatile09 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA[] threadA = new ThreadA[10];
        for (int i = 0; i < threadA.length; i++) {
            threadA[i] = new ThreadA();
            threadA[i].start();
        }
        System.out.println("当前值应该为: 10000");
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName()
                + " , count: " + ThreadA.atomicInteger.get());
    }
}

class ThreadA extends Thread {
    public static AtomicInteger atomicInteger = new AtomicInteger();

    private static void add() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " , count: " + atomicInteger.incrementAndGet());
            atomicInteger.addAndGet(1);
        }
    }

    @Override
    public void run() {
        add();
    }
}
