import java.lang.reflect.Method;

public class M08 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method + "\t" + method.isVarArgs() + "\t");
        }
    }
}

class MethodTest  {
    public void test(String name) throws Exception {
        System.out.println(name);
        throw new Exception();
    }

    public String t1(int... args) {
        return "t1";
    }

}

