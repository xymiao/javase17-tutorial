import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前月的列表");
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("当月第一天：" + firstDay);
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("当月最后一天：" + lastDay);
      
    }

}
