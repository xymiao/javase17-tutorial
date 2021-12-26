import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrDay {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("今天 E yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 ");  
        System.out.println(simpleDateFormat.format(new Date()));
    }
    
}
