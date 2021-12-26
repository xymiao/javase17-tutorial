import java.time.LocalDate;
public class LocalDateTest2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期：" + localDate);
        System.out.println("年：" + localDate.getYear());
        System.out.println("月：" + localDate.getMonthValue());
        System.out.println("日：" + localDate.getDayOfMonth());
        System.out.println("星期：" + localDate.getDayOfWeek());
        System.out.println("今年已经过去了多少天：" + localDate.getDayOfYear());
        // 判断是否是闰年
        System.out.println("是否是闰年：" + localDate.isLeapYear());
        LocalDate setLocalDate = LocalDate.of(2022, 01, 01);
        System.out.println("设置的日期为：" + setLocalDate);
        System.out.println("日期天数加10：" + setLocalDate.plusDays(10));
        System.out.println("月数加1：" + setLocalDate.plusMonths(1));
        System.out.println("星期加1：" + setLocalDate.plusWeeks(1));
        System.out.println("年数加1：" + setLocalDate.plusYears(1));

        System.out.println("日期天数减10：" + setLocalDate.minusDays(10));
        System.out.println("月数减1：" + setLocalDate.minusMonths(1));
        System.out.println("星期减1：" + setLocalDate.minusWeeks(1));
        System.out.println("年数减1：" + setLocalDate.minusYears(1));

        // 可以根据atTime 转换成 LocalDateTime 时间。 
        System.out.println("年月日加上时分：" + setLocalDate.atTime(10, 20));
        System.out.println("年月日加上时分秒：" + setLocalDate.atTime(10, 20, 30));
        System.out.println("年月日加上时分秒纳秒：" + setLocalDate.atTime(10, 20, 30, 100));
    }
}
