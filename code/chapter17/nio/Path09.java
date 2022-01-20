import java.net.URISyntaxException;
import java.nio.file.Path;

public class Path09 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("D:\\Develop", "");
        System.out.println(path);
        System.out.println(path.resolveSibling("D:\\Develop\\Java"));
        System.out.println(path.resolveSibling(Path.of("Code", "")));

        System.out.println(Path.of("Code\\Demo02", "").resolveSibling("Java"));
        System.out.println(Path.of("Code", "").resolveSibling("Java\\Demo01"));
        System.out.println(Path.of("Code\\Demo02", "").resolveSibling("Java\\Demo01"));
    }
}
