import java.util.concurrent.TimeUnit;

public class Synchronize02 {
    public static void main(String[] args) throws InterruptedException {
        long beginTime = System.currentTimeMillis();
        Synchronize02 synchronize02 = new Synchronize02();
        synchronize02.a();
        synchronize02.b();
        synchronize02.c();
        long endTime = System.currentTimeMillis();
        System.out.println("执行的总时间为：" + (endTime - beginTime) + " 毫秒");
    }
    public void a() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        System.out.println("执行 a() 方法");
    }
    public void b() throws InterruptedException{
        TimeUnit.SECONDS.sleep(1);
        System.out.println("执行 b() 方法");
    }
    public void c() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);
        System.out.println("执行 c() 方法");
    }
}
