public class Thread06 {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();
        Thread.sleep(2000);
        customThread.interrupt();
        System.out.print("end main");
    }
}
class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread run");
        for (int i = 0; i < 100; i++) {
            try {
                if (this.isInterrupted()) {
                    break;
                }
                Thread.sleep(100);
            } catch (Exception e) {
                System.err.println("\terr:" + e.getMessage());
                break;
            }
            System.out.print(" T" + i);
        }
    }
}
