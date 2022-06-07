

public class Volatile08 {
    public static void main(String[] args) throws InterruptedException {
        ThreadA[] threadA = new ThreadA[10];
        for (int i = 0; i < threadA.length; i++) {
            threadA[i] = new ThreadA();
            threadA[i].start();
        }
        System.out.println("当前值应该为: 10000");
    }
}

class ThreadA extends Thread {
    public static volatile int count = 0;

    private synchronized static void add() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName() + " , count: " + count);
    }

    @Override
    public void run() {
        add();
    }
}
