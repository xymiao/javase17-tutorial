
import java.io.CharArrayWriter;

public class CharArrayWriter02 {
    public static void main(String[] args) {
        String data = "使用 toString 方法的调用效果";

        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            charArrayWriter.write(data);
            String msg = charArrayWriter.toString();
            System.out.print(msg);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
