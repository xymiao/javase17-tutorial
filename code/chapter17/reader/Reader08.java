import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Reader08 {
    public static void main(String[] args) {
        char[] array = new char[100];
        try (InputStream stream = new FileInputStream("Reader08.java");
                InputStreamReader reader = new InputStreamReader(stream, "GBK");
                InputStreamReader reader2 = new InputStreamReader(stream, Charset.forName("UTF8"))) {
            System.out.println("reader字符集：" + reader.getEncoding());
            System.out.println("reader2字符集：" + reader2.getEncoding());
           
            reader.read(array);
            System.out.println("reader读取100个字符:");
            System.out.println(array);

            reader2.read(array);
            System.out.println("reader2读取100个字符:");
            System.out.println(array);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
