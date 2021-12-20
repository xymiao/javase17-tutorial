import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("List 的实现 ArrayList 的使用方法！");
        arrayList.add("该类的使用很简单,");
        arrayList.add("想要理解透原理， 还是需要下一番功夫的！");
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
