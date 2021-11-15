/**
 * ByteObject 使用
 */
public class ByteObject {

    public static void main(String[] args) {
        Byte byteValue = new Byte("80");
        System.out.println(byteValue);

        byteValue = Byte.valueOf("65");
        System.out.println(byteValue);

        System.out.println("Min: " + Byte.MIN_VALUE + " Max: " + Byte.MAX_VALUE);
    }
}
