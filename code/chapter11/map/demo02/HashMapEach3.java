import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEach3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }

        Iterator<Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }

}
