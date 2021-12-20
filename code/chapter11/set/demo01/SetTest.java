import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        SetTest setTest = new SetTest();
        List<String> list = setTest.init();
        System.out.println("数据去重: ");
        Set<String> set = new HashSet<>();
        for (String str : list) {
            set.add(str);
        }
        System.out.println("去重之后的数据为: " + set.size());
    }
    private List<String> init() {
        System.out.println("初始化数据: ");
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(index));
            index++;
        }
        index = 0;
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(index));
            index++;
        }
        index = 0;
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(index));
            index++;
        }
        System.out.println("数据一共有: " + list.size());
        return list;
    }
}

