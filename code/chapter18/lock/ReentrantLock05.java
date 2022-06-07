import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock05 {
    public static void main(String[] args) throws Exception {
        Service05 service05 = new Service05();

        ThreadA threadA = new ThreadA(service05);
        threadA.start();
        ThreadB threadB = new ThreadB(service05);
        threadB.start();
    }
}

class Service05 {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private boolean testFlag = false;

    public void producer() {
        try {
            lock.lock();
            if (testFlag) {
                condition.await();
            }
            System.out.println("producer() 生产");
            testFlag = true;
            condition.signal();
        } catch (InterruptedException e) {
        } finally {
            lock.unlock();
        }
    }

    public void consumer() {
        lock.lock();
        try {
            if (testFlag == false) {
                condition.await();
            }
            System.out.println("consumer() 消费");
            testFlag = false;
            condition.signal();
        } catch (InterruptedException e) {

        } finally {
            lock.unlock();
        }
    }

}

class ThreadA extends Thread {
    private Service05 service05;

    public ThreadA(Service05 service05) {
        this.service05 = service05;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            service05.producer();
        }

    }
}

class ThreadB extends Thread {
    private Service05 service05;

    public ThreadB(Service05 service05) {
        this.service05 = service05;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            service05.consumer();
        }
    }
}