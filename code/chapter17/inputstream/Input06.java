import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Input06 {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream1 = new FileInputStream("Input06.java");
                FileInputStream fileInputStream2 = new FileInputStream("Input06.java");
                SequenceInputStream sequence = new SequenceInputStream(fileInputStream1, fileInputStream2)) {

            byte[] b = new byte[1024];
            int hasRead = 0;
            while ((hasRead = sequence.read(b)) != -1) {
                System.out.println(new String(b, 0, hasRead));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
