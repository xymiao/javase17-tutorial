import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Input05 {
    public static void main(String[] args) {

        try (PipedInputStream in = new PipedInputStream();
                PipedOutputStream out = new PipedOutputStream(in)) {
            String message = "这里是 PipedInputStream 的演示 ···";
            byte[] buffer = message.getBytes();
            out.write(buffer);

            byte[] b = new byte[100];
            int hasRead = 0;
            while (in.available() > 0) {
                hasRead = in.read(b);
                System.out.println(new String(b, 0, hasRead));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
