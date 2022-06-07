import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock19 {
    public static void main(String[] args) throws Exception {
        Service19 service19 = new Service19();

        Thread threadA = new Thread(() -> {
            service19.waitTest();
        });
        threadA.start();

        Thread threadB = new Thread(() -> {
            service19.waitTest();
        });
        threadB.start();
    }

}

class Service19 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitTest() {
        try {
            if(lock.tryLock()){
                System.out.println("获得了锁");
            }else{
                System.out.println("没有获得锁");
            }
        } catch (Exception e) {
        } finally {
           if(lock.isHeldByCurrentThread()){
               lock.unlock();
           }
        }
    }
}
