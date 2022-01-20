import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Files07 {
  public static void main(String[] args) throws Exception {
    List<String> listStr = Files.readAllLines(Path.of("Files07.java"));
    System.out.println(listStr.size());

    listStr = Files.readAllLines(Path.of("Files07.java"), Charset.forName("UTF-8"));
    System.out.println(listStr.size());
    String s = Files.readString(Path.of("Files07.java"));
    System.out.println(s.substring(0, 100));
    s = Files.readString(Path.of("Files07.java"), Charset.forName("UTF-8"));
    System.out.println(s.substring(0, 100));
  }
}
