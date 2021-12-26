import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateStr = localDate.format(formatter);
        System.out.println("格式化的时间：" + dateStr);
        
        LocalDate localDate2 = LocalDate.parse(dateStr, formatter);
        System.out.println("转换回来的时间为：" + localDate2);
    }

}
