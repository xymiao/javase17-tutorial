import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock02 {

    public static void main(String[] args) throws Exception{
        Service02 service02 = new Service02();
        
        ThreadA threadA = new ThreadA(service02);
        threadA.start();
        TimeUnit.SECONDS.sleep(5);

        service02.testSignal();
    }

}

class Service02 {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void testAWait() {
        lock.lock();
        try {
            System.out.println("Time: " + System.currentTimeMillis() + ", testAWait(), Thread " + Thread.currentThread().getName());
            condition.await();
            System.out.println("通知之后的效果");
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
}

class ThreadA extends Thread {
    private Service02 service02;

    public ThreadA(Service02 service02) {
        this.service02 = service02;
    }

    @Override
    public void run() {
        service02.testAWait();
    }
}
