import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 12, 12);
        System.out.println(calendar.getMinimalDaysInFirstWeek());
    }
    
}
