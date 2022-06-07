import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock11 {

    public static void main(String[] args) throws Exception {
        Service11 service11 = new Service11();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                service11.waitTest();
            });
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        TimeUnit.SECONDS.sleep(5);
        service11.signalTest();
    }
   
}
class Service11{
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitTest(){
        try {
            lock.lock();
            condition.await();
            System.out.println("waitTest() 等待的线程数: " + lock.getWaitQueueLength(condition));
        } catch (Exception e) {
        }finally{
            lock.unlock();
        }
    }

    public void signalTest(){
        try {
            lock.lock();
            System.out.println("signalTest() 等待的线程数: " + lock.getWaitQueueLength(condition));
            condition.signal();
        } catch (Exception e) {
        }finally{
            lock.unlock();
        }
    }
}
