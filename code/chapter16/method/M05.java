import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class M05 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
           System.out.println("方法参数：" + method.getParameterCount() + "\t");
           Parameter[]  ps = method.getParameters();
           for (Parameter p : ps) {
               System.out.print(p);
           }
           System.out.println();
           Class<?>[] cs = method.getParameterTypes();
           for (Class c : cs) {
               System.out.print(c);
           }
           System.out.println();
        }
    }
}
class MethodTest{
    public void test(String name) throws Exception{
        System.out.println(name);
        throw new Exception();
    }
    
    public String t1(){
        return "t1";
    }   

    private void sy(){
    }
}
