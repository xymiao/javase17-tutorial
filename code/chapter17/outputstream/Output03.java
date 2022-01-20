import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Output03 {
    public static void main(String[] args) {
        String content = "使用 FilterOutputStream 把该段内容写入到文件系统中。";
        byte[] bytes = content.getBytes();
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
                FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream)) {
            filterOutputStream.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
