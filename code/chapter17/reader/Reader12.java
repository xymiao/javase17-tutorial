import java.io.IOException;
import java.io.StringReader;

public class Reader12 {
    public static void main(String[] args) {
        String msg = "苗子说全栈。带你复习 Java 知识点";
        try (StringReader stringReader = new StringReader(msg)) {
            int i;
            while ((i = stringReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
