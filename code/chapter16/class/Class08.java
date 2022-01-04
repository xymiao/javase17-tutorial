
public class Class08 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("ClassTest");
        System.out.println(clazz.getDeclaredMethod("set", String.class));
        System.out.println(clazz.getDeclaredMethods().length);
        System.out.println(clazz.getMethod("set", String.class));
        System.out.println(clazz.getMethod("set", String.class).getModifiers());
        System.out.println(clazz.getMethods().length);
        System.out.println(clazz.getModifiers());
    }
}

class ClassTest {
    private void pri(){}
    public void demo(){}
    public String hi(){return "hi";}
    public void set(String name){
        System.out.println(name);
    }
    @Override
    public String toString() {
        return "ClassTest.toString()";
    }
}
