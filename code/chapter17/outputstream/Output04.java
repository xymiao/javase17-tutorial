import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Output04 {
    public static void main(String[] args) {
        String str = "使用序列化进行字符串的写入";
        try (FileOutputStream fileOutputStream = new FileOutputStream("string.tmp");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(str);
            objectOutputStream.writeByte(100);
            objectOutputStream.writeChar(200);
            objectOutputStream.writeInt(300);
            objectOutputStream.writeShort(10);
            objectOutputStream.writeFloat(0.111f);
            objectOutputStream.writeDouble(1.11d);
            objectOutputStream.writeLong(400L);
            objectOutputStream.writeBoolean(true);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
