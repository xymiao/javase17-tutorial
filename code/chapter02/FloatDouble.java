import java.util.function.DoubleToLongFunction;

/**
 * Float, Double 使用
 */
public class FloatDouble {

    public static void main(String[] args) {
        // Float 的基础用法
        Float floatValue = new Float("80");
        System.out.println(floatValue);

        floatValue = Float.valueOf("65");
        System.out.println(floatValue);

        System.out.println("Min: " + Float.MIN_VALUE + " Max: " + Float.MAX_VALUE);

        float f = Float.valueOf("566.22");
        float f2 = floatValue.floatValue();
        System.out.println("f: " + f + " f2: " + f2);


        // Double 的基础用法
        Double doubleValue = new Double("80");
        System.out.println(doubleValue);

        doubleValue = Double.valueOf("65");
        System.out.println(doubleValue);

        System.out.println("Min: " + Double.MIN_VALUE + " Max: " + Double.MAX_VALUE);

        double d = Double.valueOf("566.22");
        double d2 = doubleValue.doubleValue();
        System.out.println("d: " + d + " d2: " + d2);
    }
}
