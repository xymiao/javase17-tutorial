import java.io.CharArrayReader;
import java.io.IOException;

public class Reader04 {
    public static void main(String[] args) {
        char array[] = { '苗', '子', '说', '全', '栈', ' ', '关', '注', '收', '藏', '点', '赞', '\n'};
        try (CharArrayReader reader = new CharArrayReader(array)) {
            int index;
            while ((index = reader.read()) != -1) {
                System.out.print((char) index);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
