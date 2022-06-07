public class Thread07 {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        System.out.println("线程的状态: " + customThread.getState());
        customThread.start();
        System.out.println("线程的状态: " + customThread.getState());
        Thread.sleep(2000);
        customThread.interrupt();
        System.out.println("end main");
        System.out.println("\n线程的状态: " + customThread.getState());
        CustomThread2 customThread2 = new CustomThread2(customThread);
        customThread2.start();
        System.out.println("\n线程的状态: " + customThread.getState());
    }
}
class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("线程的状态: " + this.getState());
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.err.println("\terr:" + e.getMessage());
            }
            System.out.print(" T" + i);
        }
    }
}

class CustomThread2 extends Thread {
    private CustomThread customThread;
    CustomThread2(CustomThread customThread) {
        this.customThread = customThread;
    }
    @Override
    public void run() {
        try {
            customThread.interrupt();
            Thread.sleep(10000);
            System.out.println("\n线程的状态: " + customThread.getState());
        } catch (Exception e) {
            System.err.println("\terr:" + e.getMessage());
        }
    }
}
