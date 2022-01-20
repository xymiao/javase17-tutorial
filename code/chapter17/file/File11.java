import java.io.File;
import java.io.IOException;

public class File11 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        String[] strFiles = file.list();
        for (String s : strFiles) {
            System.out.print(s + "\t");
        }
        System.out.println();

        strFiles = file.list((f, name) -> {
           return !name.endsWith(".class");
        });
        System.out.println("过滤， 不显示 .class 文件");
        for (String s : strFiles) {
            System.out.print(s + "\t");
        }
    }
}
