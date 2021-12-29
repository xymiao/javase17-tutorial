import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo07 {
    public static void main(String[] args) {
        File file = new File("Demo01.java");
        BufferedReader reader = null;
        InputStreamReader isr = null;
        try {
            // 转换编码格式为 UTF-8 否则可能会有乱码
            isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            reader = new BufferedReader(isr);
            String tempString = null;
            int line = 1;
            // 循环读取文件， 当文件为 null 结束循环。
            while ((tempString = reader.readLine()) != null) {
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException ex) {
            }
        }
    }
}
