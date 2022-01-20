import java.io.File;
import java.io.IOException;

public class File08 {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
       
        System.out.println("是否存在该目录或者文件：" + file.exists());
        System.out.println("判断是否绝对路径：" + file.isAbsolute());
        System.out.println("判断是否是目录：" + file.isDirectory());
        System.out.println("判断是否是文件：" + file.isFile());
        System.out.println("判断是否是隐藏文件：" + file.isHidden());
    }
}
