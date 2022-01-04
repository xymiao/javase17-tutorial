import java.lang.reflect.Method;

public class M07 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method + "\t" + method.isBridge() + "\t");
        }
    }
}

class MethodTest implements SuClass<String> {
    public String t1(int... args) {
        return "t1";
    }

    @Override
    public void m(String t) {
        System.out.println(t);
    }
}

interface SuClass<T> {
    void m(T t);
}