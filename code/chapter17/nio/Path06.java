import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Iterator;

public class Path06 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("Path06.java", "");
        path = path.toAbsolutePath();
        System.out.println(path);
        System.out.println(path.startsWith("E:\\Code"));
        System.out.println(path.startsWith("nio/Path051.java"));
        System.out.println(path.startsWith(Path.of("Path06.java","")));
    }
}
