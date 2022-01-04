import java.lang.reflect.Method;

public class M06 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method + "\t" + method.isDefault());
        }
    }
}

class MethodTest implements Test{
       
}
interface Test{
    default void t(){
        System.out.println("默认的方法t()");
    }
}