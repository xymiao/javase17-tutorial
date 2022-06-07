public class Thread02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.print(" M" + i);;
        }
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(" T" + i);
        }
    }
}
