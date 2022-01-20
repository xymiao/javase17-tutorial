import java.nio.file.Files;
import java.nio.file.Path;

public class Files06 {
  public static void main(String[] args) throws Exception {
    Path basePath = Path.of("Files07.java");
    System.out.println("是否是目录: " + Files.isDirectory(basePath));
    System.out.println("文件是否可执行: " + Files.isExecutable(basePath));
    System.out.println("是否隐藏: " + Files.isHidden(basePath));
    System.out.println("是否可读: " + Files.isReadable(basePath));
    System.out.println("是否是普通文件: " + Files.isRegularFile(basePath));
    System.out.println("是否文件相同: " + Files.isSameFile(basePath, basePath));
    System.out.println("是否是链接: " + Files.isSymbolicLink(basePath));
    System.out.println("是否可写: " + Files.isWritable(basePath));
  }
}
