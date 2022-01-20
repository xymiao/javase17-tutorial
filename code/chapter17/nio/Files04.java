import java.nio.file.Files;
import java.nio.file.Path;

public class Files04 {
    public static void main(String[] args) throws Exception {
        Path pathTempDirectory = Files.createTempDirectory("prefix");
        System.out.println(pathTempDirectory);
        Path pathTempDirectory2 = Files.createTempDirectory(Path.of(""), "prefix");
        System.out.println(pathTempDirectory2.toAbsolutePath());

        Path pathTempFile = Files.createTempFile("prefix", "suffix");
        System.out.println(pathTempFile);

        Path pathTempFile2 = Files.createTempFile(Path.of(""), "prefix", "suffix");
        System.out.println(pathTempFile2);

    }
}
