import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Output02 {
    public static void main(String[] args) {
        String content = "把该段内容写入到文件系统中。";
        byte[] bytes = content.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")) {
            fileOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("file.txt"))) {
            fileOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        content = "\n之前的数据会保留， 现在是 new FileOutputStream(new File(\"file.txt\"), true) 写入";
        bytes = content.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("file.txt"), true)) {
            fileOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        content = "\n之前的数据会保留， 现在是 new FileOutputStream(\"file.txt\", true) 写入";
        bytes = content.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt", true)) {
            fileOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
