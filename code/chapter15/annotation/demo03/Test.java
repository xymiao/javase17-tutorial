import java.lang.reflect.Field;
import java.lang.reflect.Method;

@LogAnnotation(value="Test 测试类, 测试日志注解的功能")
public class Test {

    @LogAnnotation("定义变量用于存放对应的招呼的字符串")
    private String sayMsg = "hello, Java 学习者!";

    @LogAnnotation("打招呼的方法。")
    public String sayHello(){
        System.out.println(sayMsg);
        return sayMsg;
    }

    public void test(){
        System.out.println("不加注解");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("Test");
        LogAnnotation logAnnotation = (LogAnnotation)clazz.getAnnotation(LogAnnotation.class);
        if(logAnnotation == null){
            System.out.println("没有注解");
            return ;
        }
        System.out.println("类上注解内容：" + logAnnotation.value());

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            // 判断是否包含需要用到的 LogAnnotation 注解， 没有直接跳出， 不用在进行 if 嵌套
            if(!method.isAnnotationPresent(LogAnnotation.class)){
                continue;
            }
            LogAnnotation logMethod = (LogAnnotation) method.getAnnotation(LogAnnotation.class);
            if(logAnnotation == null){
                return ;
            }
            System.out.println("方法上注解：" + logMethod.value());
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(!field.isAnnotationPresent(LogAnnotation.class)){
                continue;
            }
            LogAnnotation logMethod = (LogAnnotation) field.getAnnotation(LogAnnotation.class);
            if(logAnnotation == null){
                return ;
            }
            System.out.println("字段上注解：" + logMethod.value());
        }

    }
}
