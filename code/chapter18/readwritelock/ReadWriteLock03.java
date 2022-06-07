import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock03 {
    public static void main(String[] args) {
        Service03 service03 = new Service03();
        Thread threadA = new Thread(() -> {
            service03.write();
        });
        threadA.start();
        Thread threadB = new Thread(() -> {
            service03.write();
        });
        threadB.start();
    }
}

class Service03 {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println(System.currentTimeMillis() + ", start write() " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(System.currentTimeMillis() + ", end  write() " + Thread.currentThread().getName());
        } catch (Exception e) {
        } finally {
            lock.writeLock().unlock();
        }
    }
}
