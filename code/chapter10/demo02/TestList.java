import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list = new  ArrayList();
        list.add("String");
        list.add("String2");

        for (Object object : list) {
            String s = (String) object;
            System.out.println(s);
        }
    }
}
