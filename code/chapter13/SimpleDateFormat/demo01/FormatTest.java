import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        
        String d = simpleDateFormat.format(new Date());
        System.out.println(d);
    }
}

