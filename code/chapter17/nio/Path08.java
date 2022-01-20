import java.net.URISyntaxException;
import java.nio.file.Path;

public class Path08 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("D:\\Develop", "");
        System.out.println(path);
        System.out.println(path.resolve("code"));
        System.out.println(path.resolve(Path.of("Code", "")));
    }
}
