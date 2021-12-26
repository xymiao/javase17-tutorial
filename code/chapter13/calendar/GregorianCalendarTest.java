import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date currDate = new Date();
        calendar.setTime(currDate);

        // print out a bunch of interesting things
        System.out.println("ERA: " + calendar.get(Calendar.ERA));
        System.out.println("年: " + calendar.get(Calendar.YEAR));
        System.out.println("月: " + calendar.get(Calendar.MONTH));
        System.out.println("传入年的多少周: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("月份的多少周: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("时间: " + calendar.get(Calendar.DATE));
        System.out.println("传入月份的天数: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("传入年的天数: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("传入天的星期第几天: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_WEEK_IN_MONTH: "
                + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("上午_下午: " + calendar.get(Calendar.AM_PM));
        System.out.println("小时: " + calendar.get(Calendar.HOUR));
        System.out.println("今天多少小时: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟: " + calendar.get(Calendar.MINUTE));
        System.out.println("秒: " + calendar.get(Calendar.SECOND));
        System.out.println("毫秒: " + calendar.get(Calendar.MILLISECOND));
    }
}

