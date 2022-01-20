import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader05 {
    public static void main(String[] args) {
        try (Reader reader = new StringReader("的这里的是测试的内容。的用来的演示 FilterReader 的使用的方法");
                MyFilterReader filterReader = new MyFilterReader(reader)) {
            int index;
            while ((index = filterReader.read()) != -1) {
                System.out.print((char) index);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class MyFilterReader extends FilterReader {
    MyFilterReader(Reader in) {
        super(in);
    }
    public int read() throws IOException {
        int value = super.read();
        if ((char) value == '的')
            return ((int) ' ');
        else
            return value;
    }
}
