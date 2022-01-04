import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class M09 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            MethodAnnotation ma = method.getAnnotation(MethodAnnotation.class);
            if(ma != null ){
                System.out.println(ma.value());
            }
        }
    }
}

class MethodTest {
    @MethodAnnotation(value = "test 方法")
    public void test(String name) throws Exception {
        System.out.println(name);
        throw new Exception();
    }

    @MethodAnnotation(value = "t1 的可变参数方法")
    public String t1(int... args) {
        return "t1";
    }

}

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotation {
    String value();
}
