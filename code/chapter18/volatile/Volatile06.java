import java.util.concurrent.TimeUnit;

/**
 * 32 位的 JDK 才会出现问题。64 位的已经保证其原子性。
 */
public class Volatile06 {
    public static void main(String[] args) throws InterruptedException {
       Pojo01 pojo01 = new Pojo01();
       ThreadA threadA = new ThreadA(pojo01);
       ThreadB threadB = new ThreadB(pojo01);
       threadA.start();
       threadB.start();
       TimeUnit.SECONDS.sleep(1);
       while(true){
           long  value = pojo01.index;
           if(value != 1 && value != -1){
               System.out.println("index 值" + Long.toBinaryString(value) + " 十进制是: " + value);
               System.exit(0);
           }
       }
    }
}
class Pojo01{
    public volatile long index;
}

class ThreadA extends Thread{
    private Pojo01 pojo01;
    public ThreadA(Pojo01 pojo01){
        this.pojo01 = pojo01;
    }
    @Override
    public void run() {
        while(true){
            pojo01.index = 1;
        }
    }
}

class ThreadB extends Thread{
    private Pojo01 pojo01;
    public ThreadB(Pojo01 pojo01){
        this.pojo01 = pojo01;
    }
    @Override
    public void run() {
        while(true){
            pojo01.index = -1;
        }
    }
}