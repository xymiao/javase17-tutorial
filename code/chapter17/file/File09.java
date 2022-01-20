import java.io.File;
import java.io.IOException;

public class File09 {
    public static void main(String[] args) throws IOException {
        File file = new File("File09.java");
       
        System.out.println("文件或目录的抽象路径名：" + file.getName());
        System.out.println("判断是否绝对路径：" + file.length());
        System.out.println("绝对路径的 file 对象：" + file.getAbsoluteFile());
        System.out.println("绝对路径的字符串" + file.getAbsolutePath());
        System.out.println("规范路径的 file 对象：" + file.getCanonicalFile());
        System.out.println("规范路径的字符串：" + file.getCanonicalPath());
        System.out.println("未分配的字节数：" + file.getFreeSpace() / 1024 /1024);
        System.out.println("分区总字节数：" + file.getTotalSpace() / 1024 /1024 );
        System.out.println("可用字节数：" + file.getUsableSpace() / 1024 /1024);
        System.out.println("最后的修改时间戳：" + file.lastModified());
    }
}
