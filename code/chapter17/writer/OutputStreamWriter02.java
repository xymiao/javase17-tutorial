import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter02 {
    public static void main(String[] args) {
        String data = "使用 OutputStreamWriter 的字符集，使用 UTF-8 写入。";
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8")) {
            System.out.println("当前字符集: " + outputStreamWriter.getEncoding());
            outputStreamWriter.write(data);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
