import java.util.concurrent.TimeUnit;

public class Volatile07 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA[] threadA = new ThreadA[10];
        for (int i = 0; i < threadA.length; i++) {
            threadA[i] = new ThreadA();
            threadA[i].start();
        }
        TimeUnit.SECONDS.sleep(3);
        System.out.println("获得值为: " + ThreadA.count);
        System.out.println("当前值应该为: 10000");
    }
}


class ThreadA extends Thread{
    public static volatile int count = 0;
    private static void add(){
        for (int i = 0; i < 1000; i++) {
            count ++;
        }
        System.out.println("count: " + count);
    }
    @Override
    public void run() {
       add();
    }
}
