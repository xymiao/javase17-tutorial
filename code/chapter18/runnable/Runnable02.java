public class Runnable02 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread threadRunnable = new Thread(myRunnable);
        threadRunnable.start();
        System.out.println("MyRunnable 执行完毕");
    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现 Runnable 接口的 run() 方法。");
    }
}
