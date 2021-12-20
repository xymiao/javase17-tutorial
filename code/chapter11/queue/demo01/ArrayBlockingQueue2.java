import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        for (int i = 0; i < 4; i++) {
            // 这里元素只能保存 3 个， 入队的时候写入了4 个， 第 4 个会报异常：IllegalStateException
            queue.add(String.valueOf(i));
            System.out.println(queue);
        }
    }
}
