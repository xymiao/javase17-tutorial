import java.io.File;
import java.io.IOException;

public class File04 {
    public static void main(String[] args) throws IOException{
       File file = File.createTempFile("templates", ".xml");
       System.out.println(file.getAbsolutePath());

       file = File.createTempFile("templates", ".xml", new File("."));
       System.out.println(file.getAbsolutePath());
    }
    
}
