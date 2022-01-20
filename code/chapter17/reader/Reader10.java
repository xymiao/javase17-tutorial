import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Reader10 {
    public static void main(String[] args) {
        char[] cbuf = new char[100];
        char[] cbuf2 = new char[100];
        char[] cbuf3 = new char[100];
        char[] cbuf4 = new char[100];
        char[] cbuf5 = new char[100];
        try(FileReader fileReader = new FileReader(new File("file.txt"));
        FileReader fileReader2 = new FileReader("file.txt");
        FileReader fileReader3 = new FileReader(new File("file.txt"), Charset.forName("UTF8"));
        FileReader fileReader4 = new FileReader("file.txt",  Charset.forName("UTF8"));
        FileReader fileReader5 = new FileReader(new FileInputStream("file.txt").getFD())){
            fileReader.read(cbuf);
            System.out.println("fileReader: ");
            System.out.println(cbuf);
            fileReader2.read(cbuf2);
            System.out.println("fileReader2: " );
            System.out.println(cbuf2);
            fileReader3.read(cbuf3);
            System.out.println("fileReader3: ");
            System.out.println(cbuf3);
            fileReader4.read(cbuf4);
            System.out.println("fileReader4: " );
            System.out.println(cbuf4);
            fileReader5.read(cbuf5);
            System.out.println("fileReader5: ");
            System.out.println(cbuf5);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
