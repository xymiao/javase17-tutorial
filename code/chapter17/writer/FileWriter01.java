import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        String data = "使用 FileWriter 写入数据到文件中。";
        try (FileWriter fileWriter = new FileWriter("test.txt");) {
            fileWriter.write(data);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
