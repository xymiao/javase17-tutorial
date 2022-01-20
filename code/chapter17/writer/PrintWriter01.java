import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter01 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("test1.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                PrintWriter printWriter2 = new PrintWriter(fileWriter, true)) {
            printWriter.print("print 方法的使用 注意ln 和不包含的区别。");
            printWriter.println("println 方法的使用");
            printWriter.write("PrintWriter 使用方式");
            printWriter2.write("printWriter2 的使用方式");
            printWriter2.append("append 的方法使用方式");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
