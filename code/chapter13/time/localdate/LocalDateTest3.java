import java.time.LocalDate;

public class LocalDateTest3 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 01, 01);
        LocalDate date2 = LocalDate.of(2021, 12, 26);
        System.out.println(" date1: " +date1 + " date2: " + date2);
        System.out.println("date1.isAfter(date2): " + date1.isAfter(date2));
        System.out.println("date2.isAfter(date1): " + date2.isAfter(date1));

        System.out.println("date1.isBefore(date2): " + date1.isBefore(date2));
        System.out.println("date2.isBefore(date1): " + date2.isBefore(date1));

        System.out.println("date1.compareTo(date2): " + date1.compareTo(date2));
        System.out.println("date1.compareTo(date1): " + date1.compareTo(date1));
        System.out.println("date1.compareTo(date1): " + date2.compareTo(date1));
    }

}
