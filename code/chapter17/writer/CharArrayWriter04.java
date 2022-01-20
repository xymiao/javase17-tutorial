import java.io.CharArrayWriter;

public class CharArrayWriter04 {
    public static void main(String[] args) {
        String data = "size 方法和reset 方法调用效果";
        
        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            charArrayWriter.write(data);
            int size = charArrayWriter.size();
            System.out.println(size);
            charArrayWriter.reset();
            System.out.println(charArrayWriter.size());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
