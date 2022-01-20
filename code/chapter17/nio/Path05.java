import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Iterator;

public class Path05 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("Path05.java", "");
        path = path.toAbsolutePath();
        System.out.println(path);
        System.out.println(path.endsWith("nio/Path05.java"));
        System.out.println(path.endsWith("nio/Path051.java"));
        System.out.println(path.endsWith(Path.of("Path05.java","")));

    }
}
