import java.net.URISyntaxException;
import java.nio.file.Path;

public class Path07 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("Path06.java", "");
        System.out.println(path);
        System.out.println(path.toAbsolutePath().normalize());

        Path path2 = Path.of("E:\\Code\\MzOpenSource\\backend\\javase17-tutorial\\code\\chapter17\\nio\\Path06.java", "");
        Path path3 = Path.of("E:\\Code\\MzOpenSource\\backend\\javase17-tutorial\\code\\", "");
        
        Path relativize = path2.relativize(path3);
        System.out.println(relativize);

        Path path4 = Path.of("D:\\Develop\\Java\\", "");
        Path path5 = Path.of("D:\\Program", "");
        
        System.out.println( path4.relativize(path5));

        System.out.println( path4.relativize(path4));
    }
}
