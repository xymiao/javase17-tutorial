import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Input07 {
    public static void main(String[] args) {
        byte[] buffer = new byte[] { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9 };

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
                FilterInputStream filterInputStream = new BufferedInputStream(byteArrayInputStream)) {
            int i;
            while (filterInputStream.available() > 0) {
                i = filterInputStream.read();
                System.out.print(i + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
