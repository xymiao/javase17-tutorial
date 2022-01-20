import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class PrintWriter02 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");
                PrintWriter printWriter = new PrintWriter(fileOutputStream);
                PrintWriter printWriter2 = new PrintWriter(fileOutputStream, true);
                PrintWriter printWriter3 = new PrintWriter(fileOutputStream, true, Charset.forName("GB2312"))) {
            printWriter.print("print 方法的使用 注意ln 和不包含的区别。");
            printWriter.println("println 方法的使用");
            printWriter.write("printWriter fileOutputStream 使用方式");

            printWriter2.write("printWriter2 fileOutputStream 的使用方式");
            printWriter2.append("append 的方法使用方式");
            printWriter3.write("注意其中的差别");

            printWriter.flush();
            printWriter2.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
