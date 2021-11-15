public class FloatDoubleForceConvert {
    public static void main(String[] args) {
        int intVal = 3;
        double d = intVal;   
        System.out.println(d); // 3.0

        double doubleVal = 3.3;
        intVal = (int)doubleVal;
        System.out.println(intVal); // 3
        
        intVal = 1;
        double result = intVal - 0.9;
        System.out.println(result); // 0.09999999999999998
    }
}
