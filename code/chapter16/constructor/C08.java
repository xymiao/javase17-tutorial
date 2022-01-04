import java.lang.reflect.Constructor;

public class C08 {
    public static void main(String[] args) throws Exception {
        Constructor constructor = ConstructorTest.class.getDeclaredConstructor(String.class);
        Class class1 = constructor.getDeclaringClass();
        System.out.println(class1);
        System.out.println(class1.getName());
    }
}

class ConstructorTest {
    ConstructorTest(String name) {
    }
}
