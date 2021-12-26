import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class CurrMonth {
    public static void main(String[] args) {
        showMonth(LocalDate.now());
        System.out.println("");
        showMonth(LocalDate.now().plusMonths(1));
    }
    public static void showMonth(LocalDate localDate){
        System.out.println("======" + localDate.getYear() + " 年 " + localDate.getMonthValue() + " 月 =======");
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("一   二  三  四  五  六  日");
        int week = firstDay.getDayOfWeek().getValue();
        for (int i = 1; i < week % 7; i++) {
            System.out.printf("%2s  "," ");
        }
        LocalDate currDate = firstDay;
        for (int i = firstDay.getDayOfMonth(); i <= lastDay.getDayOfMonth(); i++) {
            week = currDate.getDayOfWeek().getValue();
            System.out.printf("%3d",i);
            if(currDate.getDayOfMonth() == localDate.getDayOfMonth()){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
            if(week == 7){
                System.out.println();
            }
            currDate = firstDay.plusDays(i);
        }
    }
}
