import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock04 {
    public static void main(String[] args) throws Exception{
        Service04 service04 = new Service04();
        
        ThreadA threadA = new ThreadA(service04);
        threadA.start();
        ThreadB threadB = new ThreadB(service04);
        threadB.start();
        TimeUnit.SECONDS.sleep(5);

        service04.testSignal2();
    }
}

class Service04 {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    Condition condition2 = lock.newCondition();
    public void testAWait() {
        try {
            lock.lock();
            System.out.println("Time: " + System.currentTimeMillis() + ", testAWait(), Thread " + Thread.currentThread().getName());
            condition.await();
            System.out.println("testAWait() 通知之后的效果");
        } catch(InterruptedException e){
        }finally {
            lock.unlock();
        }
    }
    public void testSignal() {
        lock.lock();
        try {
            System.out.println("Time: " + System.currentTimeMillis() + ", testSignal(), Thread " + Thread.currentThread().getName()  );
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
    public void testAWait2() {
        try {
            lock.lock();
            System.out.println("Time: " + System.currentTimeMillis() + ", testAWait2(), Thread " + Thread.currentThread().getName());
            condition2.await();
            System.out.println("testAWait2() 通知之后的效果");
        } catch(InterruptedException e){
        }finally {
            lock.unlock();
        }
    }
    public void testSignal2() {
        lock.lock();
        try {
            System.out.println("Time: " + System.currentTimeMillis() + ", testSignal2(), Thread " + Thread.currentThread().getName()  );
            condition2.signal();
        } finally {
            lock.unlock();
        }
    }
}
class ThreadA extends Thread {
    private Service04 service04;

    public ThreadA(Service04 service04) {
        this.service04 = service04;
    }

    @Override
    public void run() {
        service04.testAWait();
    }
}
class ThreadB extends Thread {
    private Service04 service04;

    public ThreadB(Service04 service04) {
        this.service04 = service04;
    }

    @Override
    public void run() {
        service04.testAWait2();
    }
}