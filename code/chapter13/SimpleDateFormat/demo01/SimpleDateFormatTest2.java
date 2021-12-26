import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("G E F yyyy-MM-dd HH:mm:ss.S z");
        
        String d = simpleDateFormat.format(new Date());
        System.out.println(d);
    }
    
}
