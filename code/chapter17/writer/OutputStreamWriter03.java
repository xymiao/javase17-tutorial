import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriter03 {
    public static void main(String[] args) {
        String data = "多种构造方法调用方式";
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.forName("UTF-8"))) {
            outputStreamWriter.write(data);
            outputStreamWriter.append(data);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
