import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEach4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }

        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println("value: " + s);
        }
    }

}
