import java.lang.reflect.Constructor;

public class C01 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ConstructorTest");
        Constructor constructor = clazz.getDeclaredConstructor();
        System.out.println(constructor);
        Object obj = constructor.newInstance();
        System.out.println(obj);
    }

}

class ConstructorTest {
    // 为了方便查看效果，重载默认的构造方法
    public ConstructorTest() {
        System.out.println("默认的构造方法！");
    }

    @Override
    public String toString() {
        return "ConstructorTest.toString()";
    }
}
