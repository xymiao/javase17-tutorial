import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader03 {
    public static void main(String[] args) {
        char[] array = new char[100];
        try (FileReader fileReader = new FileReader("Reader03.java");
                BufferedReader bufferedReader = new BufferedReader(fileReader, 5000)) {
            bufferedReader.read(array);
            System.out.println(array);
            // 或者使用 while 循环 判断 read 方法的返回值是否等于 -1。等于 -1 说明内容读取完毕。
            // 这里只是演示 read(array) 的使用方法。
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
