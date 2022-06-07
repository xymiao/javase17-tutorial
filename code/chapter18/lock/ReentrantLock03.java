import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock03 {
    public static void main(String[] args) throws Exception{
        Service03 service03 = new Service03();
        
        ThreadA threadA = new ThreadA(service03);
        threadA.start();
        TimeUnit.SECONDS.sleep(5);

        service03.testSignal();
    }
}

class Service03 {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    // 演示错误的方式，不包含对应的锁
    public void testAWait() {
        try {
            System.out.println("Time: " + System.currentTimeMillis() + ", testAWait(), Thread " + Thread.currentThread().getName());
            condition.await();
            System.out.println("通知之后的效果");
        } catch(InterruptedException e){
        }finally {
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
    private Service03 service03;

    public ThreadA(Service03 service03) {
        this.service03 = service03;
    }

    @Override
    public void run() {
        service03.testAWait();
    }
}
