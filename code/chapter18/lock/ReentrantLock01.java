import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock01 {

    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ThreadA threadA1 = new ThreadA(serviceA);
        ThreadA threadA2 = new ThreadA(serviceA);
        ThreadA threadA3 = new ThreadA(serviceA);
        ThreadA threadA4 = new ThreadA(serviceA);
        ThreadA threadA5 = new ThreadA(serviceA);
       
        threadA1.start();
        threadA2.start();
        threadA3.start();
        threadA4.start();
        threadA5.start();
    }

}

class ServiceA {
    private Lock lock = new ReentrantLock();

    public void testLock() {
        lock.lock();
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " index " + (i + 1));
        }
        lock.unlock();
    }
}

class ThreadA extends Thread {
    private ServiceA serviceA;

    public ThreadA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void run() {
        serviceA.testLock();
    }
}
