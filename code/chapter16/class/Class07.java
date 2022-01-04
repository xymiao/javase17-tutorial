
public class Class07 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("ClassTest");
       System.out.println(clazz.getDeclaredField("test"));
       System.out.println(clazz.getDeclaredFields().length);
       System.out.println(clazz.getField("p"));
       System.out.println(clazz.getFields().length);
    }
}

class ClassTest {
    private String test;
    public String p;
    String p2;
    int num;
}
