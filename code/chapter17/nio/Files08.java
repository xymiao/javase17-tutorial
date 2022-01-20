import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Files08 {
  public static void main(String[] args) throws Exception {
    byte[] bytes = {'a', 'b', 'c', 'd'};
    Path PathBytes = Files.write(Path.of("text.txt"), bytes);
    System.out.println(PathBytes);

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("写入内容text3");
    arrayList.add("写入内容text2");
    Path pathList = Files.write(Path.of("text2.txt"), arrayList);
    System.out.println(pathList);
    pathList = Files.write(Path.of("text3.txt"), arrayList, Charset.forName("UTF-8"));
    System.out.println(pathList);

    Files.writeString(Path.of("text4.txt"), "写入字符的内容text4");
    Files.writeString(Path.of("text5.txt"), "写入字符的内容text5", Charset.forName("UTF-8"));
  }
}
