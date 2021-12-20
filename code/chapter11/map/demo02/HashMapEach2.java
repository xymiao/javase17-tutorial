import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEach2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }

}
