import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReadWriteLock02 {
    public static void main(String[] args) {
        Service02 service02 = new Service02();
        Thread threadA = new Thread(() -> {
            service02.test();
        });
        threadA.start();
        Thread threadB = new Thread(() -> {
            service02.test();
        });
        threadB.start();
    }
}

class Service02 {
    private ReentrantLock lock = new ReentrantLock();

    public void test() {
        try {
            lock.lock();
            System.out.println(System.currentTimeMillis() + ", start test2()" + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(System.currentTimeMillis() + ", end  test2()" + Thread.currentThread().getName());
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
