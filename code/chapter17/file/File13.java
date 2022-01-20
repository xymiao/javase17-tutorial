import java.io.File;
import java.io.IOException;

public class File13 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        
        File[] files = file.listFiles((f) -> {
           return f.getName().endsWith(".class");
        });

        System.out.println("过滤， 只显示 .class 文件");
        for (File f : files) {
            System.out.print(f + "\t");
        }
    }
}
