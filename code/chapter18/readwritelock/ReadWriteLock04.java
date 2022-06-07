import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock04 {
    public static void main(String[] args) throws Exception {
        Service04 service04 = new Service04();
        Thread threadA = new Thread(() -> {
            service04.read();
        });
        threadA.start();

        TimeUnit.SECONDS.sleep(1);

        Thread threadB = new Thread(() -> {
            service04.write();
        });
        threadB.start();
    }
}

class Service04 {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println(System.currentTimeMillis() + ", start read() " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(System.currentTimeMillis() + ", end  read() " + Thread.currentThread().getName());
        } catch (Exception e) {
        } finally {
            lock.readLock().unlock();
        }
    }

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
