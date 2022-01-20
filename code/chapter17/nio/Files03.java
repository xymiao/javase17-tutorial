import java.nio.file.Files;
import java.nio.file.Path;

public class Files03 {
    public static void main(String[] args) throws Exception {
        String dir = "E:\\Code\\Java\\Files\\Demo\\";
        String fileName = "log.txt";
        Path pathLink = Files.createLink(Path.of("E:\\Code\\Java\\Files\\Demo\\log.bak.txt"), Path.of(dir, fileName));
        System.out.println(pathLink);

        Path pathSymbolicLink = Files.createSymbolicLink(Path.of("E:\\Code\\Java\\Files\\Demo\\log.link"),
                Path.of("E:\\Code\\Java\\Files\\Demo\\log.txt"));
        System.out.println(pathSymbolicLink);

    }

}
