import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Input03 {
    public static void main(String[] args) {
        byte[] buffer = new byte[] { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer)) {
            System.out.print("Buffer 内容: ");
            int i;
            while (byteArrayInputStream.available() > 0) {
                i = byteArrayInputStream.read();
                System.out.print(i + "  ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
