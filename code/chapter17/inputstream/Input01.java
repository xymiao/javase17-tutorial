import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        
        try(FileInputStream fileInputStream = new FileInputStream(new File("Input01.java"));){
            byte[] b = new byte[100];
            int hasRead = 0;
            while((hasRead = fileInputStream.read(b)) > 0){
                System.out.println(hasRead);
                System.out.println(new String(b, 0, hasRead));
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
