import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock20 {
    public static void main(String[] args) throws Exception {
        Service20 service20 = new Service20();

        Thread threadA = new Thread(() -> {
            service20.waitTest();
        });
        threadA.start();

        Thread threadB = new Thread(() -> {
            service20.waitTest();
        });
        threadB.start();
    }

}

class Service20 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitTest() {
        try {
            if(lock.tryLock(2, TimeUnit.SECONDS)){
                System.out.println("获得了锁");
                TimeUnit.SECONDS.sleep(3);
            }else{
                System.out.println("没有获得锁");
            }
        } catch (Exception e) {
        } finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
