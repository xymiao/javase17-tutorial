import java.io.File;
import java.io.IOException;

public class File12 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.print(f + "\t");
        }
        System.out.println();

        files = file.listFiles((f, name) -> {
           return !name.endsWith(".class");
        });
        System.out.println("过滤， 不显示 .class 文件");
        for (File f : files) {
            System.out.print(f + "\t");
        }
    }
}
