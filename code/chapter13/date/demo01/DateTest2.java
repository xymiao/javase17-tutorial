import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() - 1000 * 60);
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        
        System.out.println("date1 和 date2 比较:" );
        System.out.println("date1.after(date2) :" + date1.after(date2));
        System.out.println("date1.before(date2) :" + date1.before(date2));

        System.out.println("date1.compareTo(date2) :" + date1.compareTo(date2));
        System.out.println("date1.compareTo(date1) :" + date1.compareTo(date1));
        System.out.println("date2.compareTo(date1) :" + date2.compareTo(date1));

        System.out.println("date1.equals(date2) :" + date1.equals(date2));
        System.out.println("date1.equals(date1) :" + date1.equals(date1));

        System.out.println("date1.getTime(): " + date1.getTime());
    }
    
}
