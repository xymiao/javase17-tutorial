import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        for (int i = 100; i < 120; i++) {
            set.add(String.valueOf(i));
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
