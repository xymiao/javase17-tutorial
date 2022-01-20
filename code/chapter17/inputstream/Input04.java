import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Input04 implements Serializable {
    public static void main(String[] args) {
        //先写入对象
        write();
        //读取对应的信息
        try (FileInputStream fileInputStream = new FileInputStream("test.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            User user = (User) objectInputStream.readObject();
            System.out.println(user);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * 把对象的信息写入到test.txt 文件中
     * 先忽略该方法， 接下来的章节会详细说输出流。
     */
    public static void write() {
        File file = new File("test.txt");
        try (FileOutputStream outputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {
            objectOutputStream.writeObject(new User("1", "苗子说全栈"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
