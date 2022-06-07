public class WaitNotify04 {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify02 waitNotify02 = new WaitNotify02();
        long beginTime = System.currentTimeMillis();
        System.out.println("wait 方法测试来了，我第一个。");
        synchronized (waitNotify02) {
            System.out.println("慢跑先行，我先走一个。");
            waitNotify02.wait(1000);
            System.out.println("你先走， 我还要等待，等待是一个美好的事情。");
            waitNotify02.wait(1000, 200);
        }
        System.out.println("我就不在 synchronized 中，你看我在那运行");
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间: " + (endTime - beginTime) + " 毫秒");
    }
}
