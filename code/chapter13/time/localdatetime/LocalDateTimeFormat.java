import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒S纳秒");
        String dateStr = localDateTime.format(formatter);
        System.out.println("格式化的时间：" + dateStr);
        
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateStr, formatter);
        System.out.println("转换回来的时间为：" + localDateTime2);
    }
    
}
