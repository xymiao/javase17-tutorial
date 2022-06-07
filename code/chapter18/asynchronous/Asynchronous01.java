import java.util.concurrent.TimeUnit;

public class Asynchronous01 {
    public static void main(String[] args) throws InterruptedException {
        long beginTime = System.currentTimeMillis();
        new Thread() {
            @Override
            public void run() {
                try {
                    a();
                    long endTime = System.currentTimeMillis();
                    System.out.println("a() 执行的总时间为：" + (endTime - beginTime) + " 毫秒");
                } catch (Exception e) {
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    b();
                    long endTime = System.currentTimeMillis();
                    System.out.println("b() 执行的总时间为：" + (endTime - beginTime) + " 毫秒");
                } catch (Exception e) {
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    c();
                    long endTime = System.currentTimeMillis();
                    System.out.println("c() 执行的总时间为：" + (endTime - beginTime) + " 毫秒");
                } catch (Exception e) {
                }
            }
        }.start();
        long endTime = System.currentTimeMillis();
        System.out.println("main() 执行的总时间为：" + (endTime - beginTime) + " 毫秒");
    }

    public static void a() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("执行 a() 方法");
    }

    public static void b() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("执行 b() 方法");
    }

    public static void c() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("执行 c() 方法");
    }

}
