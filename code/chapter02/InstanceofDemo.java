import java.util.ArrayList;
import java.util.List;

/**
 * XorDemo
 */
public class InstanceofDemo {

    public static void main(String[] args) {
        Integer integer = null;
        System.out.println(integer instanceof Integer); //false

        integer = Integer.valueOf(100);
        System.out.println(integer instanceof Integer); //true

        List<String> list = new ArrayList<>();
        System.out.println(list instanceof List);//true
        System.out.println(list instanceof ArrayList); //true

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList instanceof List);//true
    }

}

