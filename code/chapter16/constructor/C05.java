import java.lang.reflect.Constructor;

public class C05 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ConstructorTest");
        System.out.println("获得具体的构造函数");
        Constructor constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Class<?>[] c = constructor.getParameterTypes();
        for (Class<?> class1 : c) {
            System.out.print(class1 + "\t");
        }
        System.out.println();

        System.out.println("该类的所有构造方法: ");
        Constructor[] cons = clazz.getDeclaredConstructors();
        System.out.println("一共有 " + cons.length + " 构造函数");
        for (Constructor c2 : cons) {
            System.out.println(c2);
            Class<?>[] c3 = c2.getParameterTypes();
            // 无参的不会带有参数
            for (Class<?> class1 : c3) {
                System.out.print(class1 + "\t");
            }
            System.out.println();
        }

    }
}

class ConstructorTest {

    public ConstructorTest() { }
    public ConstructorTest(String name) { }
    public ConstructorTest(String name, String sex, int age) {
        System.out.println("带有参数的构造方法:" + name);
    }

}
