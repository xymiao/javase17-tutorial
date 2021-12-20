import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        new Thread(new TakeQueue(queue), "消费消息").start();
        System.out.println("初始化数据: " + queue);
        new Thread(new PutQueue(queue), "生产消息").start();
    }
}

class PutQueue implements Runnable {
    private ArrayBlockingQueue<String> queue;

    public PutQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    int time = 9;

    public void run() {
        while (time >= 0) {
            try {
                System.out.println(" + 生产 ing");
                queue.put(String.valueOf(time));
                System.out.println(Thread.currentThread().getName() + ":" + time-- + " " + queue);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TakeQueue implements Runnable {
    private ArrayBlockingQueue<String> queue;

    public TakeQueue(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    int time = 9;

    public void run() {
        while (time >= 0) {
            try {
                time--;
                System.out.println(" - 消费 ing");
                String msg = queue.take();
                System.out.println(Thread.currentThread().getName() + ":" + msg + " " + queue);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}