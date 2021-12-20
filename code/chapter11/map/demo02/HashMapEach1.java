import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEach1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            // 循环所有key,通过get方法打印所有value
            System.out.print("key: " + key + ", value: " + map.get(key) + "\n");
        }
    }

}
