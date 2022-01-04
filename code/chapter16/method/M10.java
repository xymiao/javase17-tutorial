import java.lang.reflect.Method;

public class M10 {
    public static void main(String[] args) throws Exception {
        Class<MethodTest> clazz = MethodTest.class;
        MethodTest methodTest = clazz.getDeclaredConstructor().newInstance();
        Method m = clazz.getDeclaredMethod("t1", int[].class);
        Object s = m.invoke(methodTest, new int[] { 1 });
        System.out.println(s);
    }
}

class MethodTest {

    public String t1(int... args) {
        return "t1\t" + args[0];
    }

}
