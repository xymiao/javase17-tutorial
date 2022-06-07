import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock13 {

    public static void main(String[] args) throws Exception {
        Service13 service13 = new Service13();

        Thread threadA = new Thread(() -> {
            service13.waitTest();
        });
        threadA.start();
        TimeUnit.MILLISECONDS.sleep(500);
        Thread threadB = new Thread(() -> {
            service13.waitTest();
        });
        TimeUnit.MILLISECONDS.sleep(500);
        threadB.start();
        System.out.println("threadA 查询给定线程是否正在等待获取此锁: " + service13.lock.hasQueuedThread(threadA));
        System.out.println("threadB 查询给定线程是否正在等待获取此锁: " + service13.lock.hasQueuedThread(threadB));
    }

}

class Service13 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitTest() {
        try {
            lock.lock();
            TimeUnit.HOURS.sleep(1);
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
