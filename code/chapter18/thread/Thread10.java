public class Thread10 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            CustomThread customThread = new CustomThread();
            customThread.setPriority(1);
            CustomThread2 customThread2 = new CustomThread2();
            customThread2.setPriority(10);
            customThread.start();
            customThread2.start();
        }
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        String msg = this.getName() + "-CustomThread -优先级别 " + this.getPriority();
        long startTime = System.currentTimeMillis();
        long count = 0;
        for (int i = 0; i < 500000000; i++) {
           count =  count + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\t" + msg + "总用时: " + (endTime - startTime) + " 毫秒");
    }
}

class CustomThread2 extends Thread {
    @Override
    public void run() {
        String msg =  this.getName() + "-CustomThread2-优先级别" + this.getPriority();
        long startTime = System.currentTimeMillis();
        long count = 0;
        for (int i = 0; i < 500000000; i++) {
           count =  count + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\t" + msg + "总用时: " + (endTime - startTime) + " 毫秒");
    }
}
