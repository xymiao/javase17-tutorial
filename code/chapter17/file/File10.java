import java.io.File;
import java.io.IOException;

public class File10 {
    public static void main(String[] args) throws IOException {
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
