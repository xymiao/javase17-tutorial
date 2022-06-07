import java.util.concurrent.TimeUnit;

public class Thread11 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            CustomThread customThread = new CustomThread();
            customThread.setPriority(1);
            customThread.start();

            CustomThread2 customThread2 = new CustomThread2();
            customThread2.setPriority(10);
            customThread2.start();
            TimeUnit.SECONDS.sleep(20);
            customThread.interrupt();
            customThread2.interrupt();
            System.out.println("customThread : " + customThread.getIndex());
            System.out.println("customThread2: " + customThread2.getIndex());
        }
    }
}
class CustomThread extends Thread {
    private long index = 0;
    public long getIndex() {
        return index;
    }
    @Override
    public void run() {
        boolean runFlag = true;
        while (runFlag) {
            try {
                if(this.isInterrupted()){
                    runFlag = false;
                }
                index += 1;
            } catch (Exception e) {
                runFlag = false;
            }
        }
    }
}
class CustomThread2 extends Thread {
    private long index = 0;
    public long getIndex() {
        return index;
    }
    @Override
    public void run() {
        boolean runFlag = true;
        while (runFlag) {
            try {
                if(this.isInterrupted()){
                    runFlag = false;
                }
                index += 1;
            } catch (Exception e) {
                runFlag = false;
            }
        }
    }
}
