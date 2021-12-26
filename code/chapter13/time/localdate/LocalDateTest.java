import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.MAX;
        System.out.println("最大的时间: " + localDate);
        localDate = LocalDate.MIN;
        System.out.println("最小的时间: " + localDate);
        localDate = LocalDate.EPOCH;
        System.out.println("纪元年: " + localDate);
    }
    
}
