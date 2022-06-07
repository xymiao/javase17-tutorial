public class Thread08 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main 线程的优先级: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(2);
        CustomThread customThread = new CustomThread();
        CustomThread2 customThread2 = new CustomThread2();
        customThread.start();
        customThread2.start();
    }
}
class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread 线程的优先级: " + this.getPriority());
    }
}

class CustomThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread2 线程的优先级: " + this.getPriority());
    }
}
