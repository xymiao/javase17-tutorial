import java.util.concurrent.TimeUnit;

public class Volatile10 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadAa = new ThreadA(new Test10(), "a");
        ThreadA threadAb = new ThreadA(new Test10(), "b");
        ThreadA threadAc = new ThreadA(new Test10(), "c");
        ThreadA threadAd = new ThreadA(new Test10(), "d");

        threadAa.start();
        threadAb.start();
        threadAc.start();
        threadAd.start();
    }
}

class Test10 {
    void a() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + "执行了方法a()");
    }

    void b() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println(Thread.currentThread().getName() + "执行了方法b()");
    }

    void c() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName() + "执行了方法c()");
    }

    void d() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Thread.currentThread().getName() + "执行了方法d()");
    }
}

class ThreadA extends Thread {
    private String type;
    private Test10 test10;

    public ThreadA(Test10 test10, String type) {
        this.test10 = test10;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            Class.forName("Test10").getDeclaredMethod(type).invoke(test10);
        } catch (Exception e) {
        }
    }
}
