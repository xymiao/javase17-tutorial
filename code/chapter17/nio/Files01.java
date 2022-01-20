import java.nio.file.Files;
import java.nio.file.Path;

public class Files01 {
    public static void main(String[] args) throws Exception {
        //本地有个目录地址为： E:\\Code\\Java\\Files
        Path pathCreateDirectory = Files.createDirectory(Path.of("E:\\Code\\Java\\Files\\Demo"));
        System.out.println(pathCreateDirectory);

        // 根据当前年月创建目录
        Path pathCreateDirectories = Files.createDirectories(Path.of("E:\\Code\\Java\\Files\\Demo\\2022\\01"));
        System.out.println(pathCreateDirectories);
    }
    
}
