import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;

public class Path03 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("", "Path03.java");
        Path path2 = Path.of("E:\\Code\\MzOpenSource\\backend\\javase17-tutorial\\code\\chapter17\\nio\\Path03.java", "");
        System.out.println("path路径：" + path);
        System.out.println("path根路径：" + path.getRoot());
        System.out.println("path2根路径：" + path2.getRoot());

        System.out.println("path父路径：" + path.getParent());
        System.out.println("path2父路径：" + path2.getParent());

        System.out.println("path 是否是相对路径：" + path.isAbsolute());
        System.out.println("path2 是否是相对路径：" + path2.isAbsolute());

        System.out.println("路径元素数：" + path.getNameCount());
        System.out.println("路径：" + path.getFileName());
        System.out.println("转换相对路径：" + path.toAbsolutePath());

    }
}
