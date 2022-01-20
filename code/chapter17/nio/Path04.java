import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Iterator;

public class Path04 {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Path.of("", "Path04.java");
        Path path2 = Path.of("E:\\Code\\MzOpenSource\\backend\\javase17-tutorial\\code\\chapter17\\nio\\Path04.java", "");
        System.out.println("相对路径演示：");
        Iterator<Path> iterators = path.iterator();
        while(iterators.hasNext()){
			Path p = iterators.next();  
			System.out.println(p);
		}
        System.out.println("绝对路径演示：");
        Iterator<Path> iterators2 = path2.iterator();
        while(iterators2.hasNext()){
			Path p = iterators2.next();  
			System.out.println(p);
		}
    }
}
