public class Runnable04 {
    public static void main(String[] args) {
        Thread threadLambda = new Thread(()->{
            long startTime = System.currentTimeMillis();
            System.out.println("演示 yield 方法的使用。");
            long count = 0;
            for (int i = 0; i < 5000000; i++) {
                count =  count + i;
                Thread.yield();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("包含总用时: " + (endTime - startTime) + " 毫秒");
        });
        threadLambda.start();

        Thread threadLambda2 = new Thread(()->{
            long startTime = System.currentTimeMillis();
            System.out.println("演示不包含 yield 方法的使用。");
            long count = 0;
            for (int i = 0; i < 5000000; i++) {
                count =  count + i;
                //Thread.yield();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("不包含总用时: " + (endTime - startTime) + " 毫秒");
        });
        threadLambda2.start();
        
    }
}

