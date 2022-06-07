import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor01 {
    public static void main(String[] args)  throws Exception{
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for (int i = 0; i < 5; i++) {
            System.out.println("getPoolSize() " + threadPoolExecutor.getPoolSize());
            threadPoolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName() + ", Test!");
            });
            System.out.println("isShutdown: " + threadPoolExecutor.isShutdown());
            TimeUnit.MILLISECONDS.sleep(1500);
            
        }
        System.out.println("getActiveCount " + threadPoolExecutor.getActiveCount());
    }
}
