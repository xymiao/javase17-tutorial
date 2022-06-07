import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock09 {

    public static void main(String[] args) throws Exception {
        ReentrantLock reentrantLock = new ReentrantLock();
        System.out.println("1.当前线程个数: " + reentrantLock.getHoldCount());
        reentrantLock.lock();
        System.out.println("2.当前线程个数: " + reentrantLock.getHoldCount());
        test(reentrantLock);
        reentrantLock.unlock();
        System.out.println("6.当前线程个数: " + reentrantLock.getHoldCount());
    }
    static void test(ReentrantLock reentrantLock){
        System.out.println("3.当前线程个数: " + reentrantLock.getHoldCount());
        reentrantLock.lock();
        System.out.println("4.当前线程个数: " + reentrantLock.getHoldCount());
        reentrantLock.unlock();
        System.out.println("5.当前线程个数: " + reentrantLock.getHoldCount());
    }
}
