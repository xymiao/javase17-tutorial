import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock01 {
    public static void main(String[] args) {
        Service01 service01 = new Service01();
        Thread threadA = new Thread(() -> {
            service01.test();
        });
        threadA.start();
        Thread threadB = new Thread(() -> {
            service01.test();
        });
        threadB.start();
    }
}

class Service01 {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void test() {
        try {
            lock.readLock().lock();
            System.out.println(System.currentTimeMillis() + ", start ReentrantReadWriteLock 的 readLock 方法。"
                    + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(
                    System.currentTimeMillis() + ", end  ReentrantReadWriteLock 的 readLock 方法。"
                            + Thread.currentThread().getName());
        } catch (Exception e) {
        } finally {
            lock.readLock().unlock();
        }
    }
}
