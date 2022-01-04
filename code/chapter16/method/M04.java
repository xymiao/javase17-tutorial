import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class M04 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            // 根据方法获得对应的异常信息，使用数组接收
            Type[] types = method.getGenericExceptionTypes();
            for (Type type : types) {
                System.out.println(method.getName() + "\t" + type.getTypeName());
            }
            Class<?>[] classes = method.getExceptionTypes();
            for (Class c2 : classes) {
                System.out.println(c2);
            }
        }
    }
}

class MethodTest {
    public void test(String name) throws Exception {
        System.out.println(name);
        throw new Exception();
    }

    public String t1() {
        return "t1";
    }

    private void sy() {
    }
}
