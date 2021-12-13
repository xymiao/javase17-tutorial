import java.util.ArrayList;
import java.util.List;

public class TestListGeneric {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("GJ List to String");
        list.add("test list");
        
        for (String str : list) {
            System.out.println(str);
        }
    }
    
}