import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output08 {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            String content = "这个是 DataOutputStream 的演示";
            byte[] array = content.getBytes();
            for (byte b : array) {
                dataOutputStream.write(b);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
