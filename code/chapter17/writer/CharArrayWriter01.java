
import java.io.CharArrayWriter;

public class CharArrayWriter01 {
    public static void main(String[] args) {
        String data = "这是要写入的数据内容！";

        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            charArrayWriter.write(data);

            char[] chars = charArrayWriter.toCharArray();
            for (char c : chars) {
              System.out.print(c);
            }    
       
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
