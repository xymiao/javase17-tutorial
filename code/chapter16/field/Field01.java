import java.lang.reflect.Field;

public class Field01 {
    public static void main(String[] args) throws Exception{
        Class clazz = FieldTest.class;
        Field field = clazz.getField("status");
        System.out.println(field);
        // 注意 getField 和 getDeclaredField 的区别
        Field field2 = clazz.getDeclaredField("name");
        System.out.println(field2);

        //基础的操作
        String name = field2.getName(); // 获得字段的名称
        int modifiers = field2.getModifiers(); // 获得修饰符的类型，整数表达。
        System.out.println(name + "  " + modifiers);
      
    }
}

class FieldTest{
    private String name;
    public String status;
    int age;
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
