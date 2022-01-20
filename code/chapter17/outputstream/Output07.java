import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

public class Output07 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file.txt");
                CheckedOutputStream check = new CheckedOutputStream(fos, new CRC32());) {
            String content = "这个是 CheckedOutputStream 写入的内容";
            byte[] array = content.getBytes();
            for (byte b : array) {
                check.write(b);
            }
            long ckSum = check.getChecksum().getValue();
            System.out.println("Checksum: 0x" + Long.toHexString(ckSum).toUpperCase());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
