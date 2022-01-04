import java.lang.reflect.Method;

public class M02 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = MethodTest.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
class MethodTest{
    public void test(String name){
        System.out.println(name);
    }
    
    public String t1(){
        return "t1";
    }   

    private void sy(){
        System.out.println("私有方法");
    }
}
