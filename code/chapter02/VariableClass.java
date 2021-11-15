/**
 * 类变量演示
 */
public class VariableClass {
    int intValue = 1;
    static long longValue = 100000;
    public static void main(String[] args) {
        
        System.out.println("long 初始值：" + longValue);
        longValue = 10;
        VariableClass variableClass = new VariableClass();
        System.out.println("int 初始值：" + variableClass.intValue);
        variableClass.intValue = 100;
        variableClass.scope();
    }
    public void scope(){
        System.out.println("scope long: " + longValue);
        System.out.println("scope int: " + intValue);
    }
}
