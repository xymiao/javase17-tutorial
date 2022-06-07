import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock17 {
    public static void main(String[] args) throws Exception {
        Service17 service17 = new Service17();

        Thread threadA = new Thread(() -> {
            service17.test();
        });
        threadA.start();
        TimeUnit.MILLISECONDS.sleep(500);

        Thread threadB = new Thread(() -> {
            service17.test();
        });
        threadB.start();
        TimeUnit.MILLISECONDS.sleep(500);

        threadB.interrupt();
        System.out.println("threadB 中断");
    }

}

class Service17 {
    public ReentrantLock lock = new ReentrantLock();

    public void test() {
        try {
            lock.lock();
            System.out.println("begin: " + Thread.currentThread().getName() + System.currentTimeMillis());
            for (int i = 0; i < 100000000; i++) {
                String s = new String();
                Math.random();
            }
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
