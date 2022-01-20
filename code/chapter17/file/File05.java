import java.io.File;
import java.io.IOException;

public class File05 {
    public static void main(String[] args) throws IOException{
       File file = new File("./Test");
       boolean flag = file.mkdir();
       System.out.println(flag);

       file = new File("./Test/Test/Test");
       flag = file.mkdirs();
       System.out.println(flag);
    }
    
}
