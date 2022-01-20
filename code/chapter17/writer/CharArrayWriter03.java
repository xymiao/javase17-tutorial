import java.io.CharArrayWriter;

public class CharArrayWriter03 {
    public static void main(String[] args) {
        String data = "使用 append 方法的调用效果";

        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            charArrayWriter.write(data);
            charArrayWriter.append(new StringBuffer("这是追加的 CharSequence 的内容"));
            charArrayWriter.append((char)97);
            System.out.print(charArrayWriter.toString());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
