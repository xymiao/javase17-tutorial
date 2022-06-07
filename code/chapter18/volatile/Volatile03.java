import java.util.concurrent.TimeUnit;

public class Volatile03 {
    public static void main(String[] args) throws InterruptedException {
        Test02 test02 = new Test02();
        test02.start();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("及时止损，还是一拿到底。设置状态为 false, 设置我也不一定听啊");
       // test02.setContinue(false);
        System.out.println("有始有终。\n就像现在写文章一样，虽然都是历史知识点，"
                + "但也要好好思考。\n每遍的学习都是有不同的收获。");
    }
}
class Test02 extends Thread {
    private  boolean isContinue = true;
    public void setContinue(boolean isContinue) {
        this.isContinue = isContinue;
    }
    public void test() {
        System.out.println("进入 test() 方法");
        while (isContinue) {
        }
    }

    @Override
    public void run() {
        test();
    }
}
