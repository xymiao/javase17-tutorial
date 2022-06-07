import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock15 {
    public static void main(String[] args) throws Exception {
        Service15 service15 = new Service15();

        Thread threadA = new Thread(() -> {
            service15.waitTest();
        });
        threadA.start();
    }

}

class Service15 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitTest() {
        try {
            System.out.println("判断当前线程是否已经获得锁: " + lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("判断当前线程是否已经获得锁: " + lock.isHeldByCurrentThread());
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
