import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class AbstractListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list测试");
        list.add("接口和实现");
        list.add("注意抽象类");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
