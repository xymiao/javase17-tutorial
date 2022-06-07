import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor02 {
    public static void main(String[] args)  throws Exception{
       Executors.newFixedThreadPool(5);
    }
}
