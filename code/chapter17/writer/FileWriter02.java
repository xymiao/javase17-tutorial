import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileWriter02 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("test.txt", true);
                FileWriter fileWriter2 = new FileWriter("test.txt", Charset.forName("UTF-8"));
                FileWriter fileWriter3 = new FileWriter("test.txt", Charset.forName("UTF-8"), true);
                FileWriter fileWriter4 = new FileWriter(new File("test.txt"));
                FileWriter fileWriter5 = new FileWriter(new File("test.txt"), true);
                FileWriter fileWriter6 = new FileWriter(new File("test.txt"), Charset.forName("UTF-8"));
                FileWriter fileWriter7 = new FileWriter(new File("test.txt"), Charset.forName("UTF-8"), true);) {
            fileWriter.write(fileWriter.getEncoding() + " fileWriter 写入" + System.lineSeparator());
            fileWriter2.write(fileWriter2.getEncoding() + "fileWriter2 写入" + System.lineSeparator());
            fileWriter3.write(fileWriter3.getEncoding() + "fileWriter3 写入" + System.lineSeparator());
            fileWriter4.write(fileWriter4.getEncoding() + "fileWriter4 写入" + System.lineSeparator());
            fileWriter5.write(fileWriter5.getEncoding() + "fileWriter5 写入" + System.lineSeparator());
            fileWriter6.write(fileWriter6.getEncoding() + "fileWriter6 写入" + System.lineSeparator());
            fileWriter7.write(fileWriter7.getEncoding() + "fileWriter7 写入" + System.lineSeparator());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
