import java.io.PrintStream;

public class Output09 {
    public static void main(String[] args) {
        String str = "PrintStream 写入数据\n";
        char[] array = str.toCharArray();

        try (PrintStream ps = System.out; PrintStream out = new PrintStream("file.txt")) {
            ps.print(array);
            out.println("x");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
