import java.lang.reflect.Method;

public class M01 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = MethodTest.class;
        Method[] methods = clazz.getMethods();
        System.out.println("第一种方式, 多个公共的方法");
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("第二种方式, 单个公共方法");
        Method method = clazz.getMethod("test", String.class);
        System.out.println(method);
        System.out.println("第三种方式, 不包含继承的方法");
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method method2 : methods2) {
            System.out.println(method2);
        }
        System.out.println("第四种方式, 单个公共方法");
        Method method2 = clazz.getDeclaredMethod("sy");
        System.out.println(method2);
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
