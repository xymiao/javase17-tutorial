import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock16 {
    public static void main(String[] args) throws Exception {
        Service16 service16 = new Service16();

        Thread threadA = new Thread(() -> {
            service16.waitTest();
        });
        threadA.start();
    }

}

class Service16 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitTest() {
        try {
            System.out.println("查询此锁是否由任何线程持有: " + lock.isLocked());
            lock.lock();
            System.out.println("查询此锁是否由任何线程持有: " + lock.isLocked());
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
