import java.lang.reflect.Constructor;

public class C02 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ConstructorTest");
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
        Object obj = constructor.newInstance("测试String单个参数");
        System.out.println(obj);
    }

}

class ConstructorTest {
    // 为了方便查看效果，重载默认的构造方法
    public ConstructorTest(String name) {
        System.out.println("带有参数的构造方法:" + name);
    }

    @Override
    public String toString() {
        return "ConstructorTest.toString()";
    }
}
