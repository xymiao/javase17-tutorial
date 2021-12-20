import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 10; i < 30; i++) {
            set.add(String.valueOf(i));
            System.out.print(" " + i);
        }
        System.out.println();

        for (String str : set) {
            System.out.print(" " +  str);
        }
        System.out.println();
    }
    
}

