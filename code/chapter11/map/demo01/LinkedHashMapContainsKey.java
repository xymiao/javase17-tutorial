import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapContainsKey {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put(args[i], args[i]);
        }
        System.out.println(map);
        boolean boolFlag = map.containsKey("3");
        if (boolFlag) {
            System.out.println("key: 包含3");
        } else {
            System.out.println("key: 不包含3");
        }

        boolFlag = map.containsValue("4");
        if (boolFlag) {
            System.out.println("value: 包含4");
        } else {
            System.out.println("value: 不包含4");
        }

    }

}
