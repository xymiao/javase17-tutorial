import java.lang.reflect.Constructor;

public class C04 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ConstructorTest");
        Constructor conNo = clazz.getDeclaredConstructor();
        System.out.println("无参构造方法: " + conNo.getParameterCount());

        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println("有参构造方法: " + constructor.getParameterCount());

        Constructor constructor2 = clazz.getDeclaredConstructor(String.class, String.class);
        System.out.println("有参构造方法: " + constructor2.getParameterCount());
        Class<?>[] c = constructor.getParameterTypes();
        for (Class<?> class1 : c) {
            System.out.println(class1);
        }
    }
}

class ConstructorTest {

    public ConstructorTest() {
        System.out.println("无参数构造方法");
    }

    public ConstructorTest(String name) {
        System.out.println("带有参数的构造方法:" + name);
    }

    public ConstructorTest(String id, String name) {
        System.out.println("带有 2 参数的构造方法:" + name);
    }

    @Override
    public String toString() {
        return "ConstructorTest.toString";
    }
}
