import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("测试");
        list.add("可能就这样简单吧!");
        
        for (String str : list) {
            System.out.println(str);
        }
    }
}
