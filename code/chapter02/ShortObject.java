/**
 * Short 使用
 */
public class ShortObject {

    public static void main(String[] args) {
        Short shortValue = new Short("80");
        System.out.println(shortValue);

        shortValue = Short.valueOf("65");
        System.out.println(shortValue);

        System.out.println("Min: " + Short.MIN_VALUE + " Max: " + Short.MAX_VALUE);
    }
}
