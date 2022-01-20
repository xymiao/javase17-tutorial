import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;

public class Path02 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of(new URI("file:///E://Code//Hello.java"));
        System.out.println(path);
    }
}
