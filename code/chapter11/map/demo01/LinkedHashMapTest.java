import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map  = new  LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(String.valueOf(i), String.valueOf(i) + "value");
            System.out.print(String.valueOf(i) + " ");
        }
        for (int i = 10; i < 13; i++) {
            map.put(String.valueOf(i), String.valueOf(i) + "value");
            System.out.print(String.valueOf(i) + " ");
        }
        for (int i = 20; i < 23; i++) {
            map.put(String.valueOf(i), String.valueOf(i) + "value");
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
        System.out.println(map);
    }
}
