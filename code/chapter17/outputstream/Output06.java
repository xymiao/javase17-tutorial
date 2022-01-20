import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output06 {
    public static void main(String[] args) {

        try (FileOutputStream fis = new FileOutputStream("file.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fis)) {
            String content = "这个是 BufferedOutputStream 写入的内容";
            byte[] array = content.getBytes();
            for (byte b : array) {
                bos.write(b);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
