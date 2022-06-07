public class Thread09 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main 线程的优先级: " + Thread.currentThread().getPriority());
        System.out.println("设置 main 线程的优先级设置为 7");
        Thread.currentThread().setPriority(7);
        System.out.println("main 线程的优先级: " + Thread.currentThread().getPriority());
    }
}


