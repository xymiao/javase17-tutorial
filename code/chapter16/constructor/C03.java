import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C03 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ConstructorTest");
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
        System.out.println(constructor.toGenericString());
        System.out.println(constructor.toString());
        System.out.println(constructor.hashCode());
        System.out.println(constructor.getName());
        System.out.println(constructor.getModifiers());
    }

}

class ConstructorTest {

    // 为了方便查看效果，重载默认的构造方法
    protected  ConstructorTest(String name) {
        System.out.println("带有参数的构造方法:" + name);
    }

    @Override
    public String toString() {
        return "ConstructorTest.toString";
    }
}
