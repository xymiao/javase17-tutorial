import java.io.File;
import java.io.IOException;

public class File07 {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
        System.out.println(file.createNewFile());

        boolean reFlag = file.renameTo(new File("2.txt"));
        System.out.println(reFlag);

        File file2 = new File("Test");
        file2.mkdir();
        reFlag = file2.renameTo(new File("Test2"));
        System.out.println(reFlag);
    }
}
