import java.nio.file.Files;
import java.nio.file.Path;

public class Files05 {
    public static void main(String[] args) throws Exception {
      Files.delete(Path.of("prefix14956008266795807605"));
        
      boolean isDelete = Files.deleteIfExists(Path.of("prefix17311423759899869910"));
      System.out.println("如果存在就删除: " + isDelete);
    }
}
