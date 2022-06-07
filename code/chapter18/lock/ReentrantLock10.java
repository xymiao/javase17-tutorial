import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock10 {

    public static void main(String[] args) throws Exception {
        Service10 service10 = new Service10();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                service10.test();
            });
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println("当前等待的线程数: " + service10.lock.getQueueLength());
    }
   
}
class Service10{
    public ReentrantLock lock = new ReentrantLock();

    public void test(){
        try {
            lock.lock();
            System.out.println("test(): " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(100);
        } catch (Exception e) {
        }finally{
            lock.unlock();
        }
    }
}
