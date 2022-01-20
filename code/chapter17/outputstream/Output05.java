import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Output05 {
    public static void main(String[] args) {
        String message = "使用序列化进行字符串的写入";
        byte[] buffer = message.getBytes();
        try (PipedOutputStream out = new PipedOutputStream();
                PipedInputStream in = new PipedInputStream(out);) {
            out.write(buffer);

            byte[] b = new byte[1024];
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
