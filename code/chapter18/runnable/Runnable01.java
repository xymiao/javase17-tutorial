public class Runnable01 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 匿名类");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        

        //等同于
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2 匿名类");
            }
        });
        thread2.start();

        System.out.println("执行结束!");
    }
    
}
