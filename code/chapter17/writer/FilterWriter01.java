import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class FilterWriter01 {
    public static void main(String[] args) {
        String data = "测试 FilterWriter 的实现调用";
        try (FileWriter fileWriter = new FileWriter("Test.java");
                MyFilterWriter myFilterWriter = new MyFilterWriter(fileWriter)) {
                    myFilterWriter.write(data);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
class MyFilterWriter extends FilterWriter {

    protected MyFilterWriter(Writer out) {
        super(out);
    }

    public void write(String str) throws IOException {
        // 字母转换成大写的。
        super.write(str.toUpperCase());
    }
}
