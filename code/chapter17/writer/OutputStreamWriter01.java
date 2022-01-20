import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter01 {
    public static void main(String[] args) {
        String data = "使用 OutputStreamWriter 写入数据到文件中。";
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);) {
            outputStreamWriter.write(data);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
