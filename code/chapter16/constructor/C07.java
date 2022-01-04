import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;

public class C07 {
    public static void main(String[] args) throws Exception {
        Constructor constructor = ConstructorTest.class.getDeclaredConstructor(String.class);
        Annotation[][] anns = constructor.getParameterAnnotations();
        for (Annotation[] as : anns) {
            for (Annotation a : as) {
                System.out.println(a);
                System.out.println(((Test) a).value());
            }
        }
    }
}

class ConstructorTest {
    @Test("默认构造函数")
    ConstructorTest(@Test(value = "name 的值") String name) {
    }
}

@Target(value = { ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER,
        ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
    String value() default "";
}
