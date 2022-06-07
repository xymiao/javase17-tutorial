import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock07 {
    public static void main(String[] args) throws Exception {
        Service07 service07 = new Service07();
        ThreadA[] threadAs1 = new ThreadA[10];
        ThreadA[] threadAs2 = new ThreadA[10];
        for (int i = 0; i < threadAs1.length; i++) {
            threadAs1[i] = new ThreadA(service07);
        }
        for (int i = 0; i < threadAs1.length; i++) {
            threadAs1[i].start();

        }
        TimeUnit.MILLISECONDS.sleep(500);
        for (int i = 0; i < threadAs2.length; i++) {
            threadAs2[i] = new ThreadA(service07);
        }
        for (int i = 0; i < threadAs2.length; i++) {
            threadAs2[i].start();
        }
    }
}

class Service07 {
    private Lock lock = new ReentrantLock(true);

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
    private Service07 service07;

    public ThreadA(Service07 service07) {
        this.service07 = service07;
    }

    @Override
    public void run() {
        service07.fairness();
    }
}
