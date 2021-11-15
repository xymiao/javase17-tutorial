/**
 * 算术运算符
 */
public class OperatorArithmetic2 {
    public static void main(String[] args) {
        int a = 3, b = 9;
        int c = 0;
        float d;

        c = a + b;
        System.out.println(c); // 12

        c = a - b;
        System.out.println(c); // -6

        c = a * b;
        System.out.println(c); // 27

        c = a / b;
        System.out.println(c); // 整数只会的整数 0

        d = (float)a / b;
        System.out.println(d); // 转义之后 0.33333334 

        c = a % b;
        System.out.println(c); // 3
    }
}

