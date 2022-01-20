import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader07 {
    public static void main(String[] args) {

        try (InputStream stream = new FileInputStream("Reader07.java");
                InputStreamReader reader = new InputStreamReader(stream)) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
