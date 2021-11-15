public class VariableFinal {
    //静态常量
    public final static String SEX_MALE="M"; 
    public final static String SEX_FEMALE="F"; 
    //成员常量（类全局常量）
    final int type = 1; 
    public static void main(String[] args) {
        //局部常量
        final int intVal = 100;
        System.out.println(intVal);
    }

    static{
        //局部常量
        final int intVal = 1000;
        System.out.println(intVal);
    }
    
}
