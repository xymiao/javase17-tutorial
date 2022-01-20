import java.nio.file.Files;
import java.nio.file.Path;

public class Files02 {
    public static void main(String[] args) throws Exception {
        //本地有个目录地址为： E:\\Code\\Java\\Files
        String dir = "E:\\Code\\Java\\Files\\Demo\\";
        String fileName = "log.txt";
        //如果目录不存在就创建目录
        if(Files.notExists(Path.of(dir))){
            System.out.println("创建了目录");
            Files.createDirectories(Path.of(dir));
        }
        Path pathFile = Path.of(dir, fileName);
        if(Files.notExists(pathFile)){
            Path pathCreateFile = Files.createFile(pathFile);
            System.out.println("文件创建: " + pathCreateFile);
        }
        boolean isCreated = Files.exists(pathFile);
        System.out.println("是否已经存在: " + isCreated);
    }
    
}
