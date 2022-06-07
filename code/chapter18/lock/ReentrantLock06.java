import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock06 {
    public static void main(String[] args) throws Exception {
        Service06 service06 = new Service06();
        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new ThreadA(service06);
            threadB[i] = new ThreadB(service06);
            threadA[i].start();
            threadB[i].start();
        }
    }
}

class Service06 {
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private boolean testFlag = false;

    public void producer() {
        try {
            lock.lock();
            while (testFlag) {
                System.out.println("producer() 等待..");
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
            while (testFlag == false) {
                System.out.println("consumer() 等待..");
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
    private Service06 service06;

    public ThreadA(Service06 service06) {
        this.service06 = service06;
    }

    @Override
    public void run() {
        service06.producer();
    }
}

class ThreadB extends Thread {
    private Service06 service06;

    public ThreadB(Service06 service06) {
        this.service06 = service06;
    }

    @Override
    public void run() {

        service06.consumer();

    }
}