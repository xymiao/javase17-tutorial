import java.io.File;
import java.io.IOException;

public class File06 {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
        System.out.println(file.delete());

        file = new File("Test");
        System.out.println(file.delete());

        file = new File("Test/2.txt");
        System.out.println(file.delete());
    }

}
