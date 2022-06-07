public class Thread05 {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();
        //customThread.join();
        customThread.join(1000);
        System.out.print("end main");
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread run");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            System.out.print(" T" + i);
        }
    }
}
