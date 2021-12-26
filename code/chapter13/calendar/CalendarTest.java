import java.util.Calendar;
import java.util.Locale;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        System.out.println("当前时间: " + calendar.getTime());
        System.out.println("年份: " + calendar.getWeekYear() + " 或者: " + calendar.get(Calendar.YEAR));
        System.out.println("月份: " + calendar.get(Calendar.MONTH));
        System.out.println("今年现在的周数: " + calendar.getWeeksInWeekYear());

        System.out.println("今天星期几: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("今天是月份的多少天: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("今天是月份的多少星期: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("今天是今年的多少天: " + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("当前时间戳: " + calendar.getTimeInMillis());
    }

}
