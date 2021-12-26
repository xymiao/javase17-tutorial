import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();   
        System.out.println("当前时间：" + localTime);
        System.out.println("最小值：" + LocalTime.MIN);
        System.out.println("最大值：" + LocalTime.MAX);
        System.out.println("午夜时间：" + LocalTime.MIDNIGHT);
        System.out.println("中午时间：" + LocalTime.NOON);
    }
}
