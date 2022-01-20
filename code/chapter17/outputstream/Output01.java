import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Output01 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            for (byte i = 0; i < 10; i++) {
                byteArrayOutputStream.write(i);
            }

            System.out.println("byteArrayOutputStream.size(): " + byteArrayOutputStream.size());

            byte[] array = byteArrayOutputStream.toByteArray();
            for (byte b : array) {
                System.out.print(b + "\t");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
