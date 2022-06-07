import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock08 {
    public static void main(String[] args) throws Exception {
        Service08 service08 = new Service08();
        ThreadA[] threadAs1 = new ThreadA[10];
        ThreadA[] threadAs2 = new ThreadA[10];
        for (int i = 0; i < threadAs1.length; i++) {
            threadAs1[i] = new ThreadA(service08);
        }
        for (int i = 0; i < threadAs1.length; i++) {
            threadAs1[i].start();

        }
       
        for (int i = 0; i < threadAs2.length; i++) {
            threadAs2[i] = new ThreadA(service08);
        }
        TimeUnit.MILLISECONDS.sleep(500);
        for (int i = 0; i < threadAs2.length; i++) {
            threadAs2[i].start();
        }
    }
}

class Service08 {
    private Lock lock = new ReentrantLock(false);

    public void fairness() {
        try {
            lock.lock();
            System.out.println("fairness() " + Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

}

class ThreadA extends Thread {
    private Service08 service08;

    public ThreadA(Service08 service08) {
        this.service08 = service08;
    }

    @Override
    public void run() {
        service08.fairness();
    }
}
