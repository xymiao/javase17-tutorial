import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThreadLocal02 {

    public static void main(String[] args) throws Exception {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
        for (int i = 0; i < 5; i++) {
            ThreadLocalTools.threadLocal.set(i);
            System.out.println("main 当前值: " + ThreadLocalTools.threadLocal.get());
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
        }
    }
}

class ThreadLocalTools {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
}

class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                ThreadLocalTools.threadLocal.set(i);
                System.out.println("ThreadA 当前值: " + ThreadLocalTools.threadLocal.get());
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
            }
        } catch (Exception e) {

        }

    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                ThreadLocalTools.threadLocal.set(i);
                System.out.println("ThreadB 当前值: " + ThreadLocalTools.threadLocal.get());
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(1000));
            }
        } catch (Exception e) {

        }
    }
}
