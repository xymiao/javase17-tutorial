import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader09 {

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(new File("Reader09.java"));){
            char[] c = new char[128];
            int hasRead = 0;
            while((hasRead = fileReader.read(c)) > 0){
                System.out.println(new String(c, 0, hasRead));
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}