import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class File01 {
    public static void main(String[] args) throws URISyntaxException{
        File file1 = new File(new File("."), "File01.java");
        System.out.println(file1);

        File file2 = new File("File01.java");
        System.out.println(file2);

        File file3 = new File(".", "File01.java");
        System.out.println(file3);

        File file4 = new File(new URI("file:///E:/Code/MzOpenSource/backend/javase17-tutorial/code/chapter17/file/File01.java"));
        System.out.println(file4);
    }
    
}
