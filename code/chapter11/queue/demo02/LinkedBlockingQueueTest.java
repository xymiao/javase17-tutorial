import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
    private static LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();

    private static void put() {
        for (int i = 1; i < 101; i++) {
            try {
                linkedBlockingQueue.put(String.valueOf(i));
                System.out.print("入队: " + String.valueOf(i));
                if(i % 10 == 0){
                    System.out.println();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void take() {
        try {
            int i = 1;
            while(!linkedBlockingQueue.isEmpty()){
                String msg = linkedBlockingQueue.take();
                System.out.print("出队: " + msg);
                if(i % 10 == 0){
                    System.out.println();
                }
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        put();
        long l2 = System.currentTimeMillis();
        System.out.println("\n 运行时间: " + (l2 - l1));
        System.out.println();
        take();
        long l3 = System.currentTimeMillis();
        System.out.println("\n 运行时间: " + (l3 - l1));
    }
}
