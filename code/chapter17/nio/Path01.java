import java.nio.file.Path;

public class Path01 {
    public static void main(String[] args) {
        Path path = Path.of("E:\\code\\Hello.java", "");
        System.out.println(path.toString());
        Path path2 = Path.of("E:\\code", "Hello.java");
        System.out.println(path2.toString());
        Path path3 = Path.of("E:", "code", "Hello.java");
        System.out.println(path3.toString());
        Path path4 = Path.of("", "E:\\code", "Hello.java");
        System.out.println(path4.toString());
       
    }
}
