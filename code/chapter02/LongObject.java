/**
 * Long 使用
 */
public class LongObject {

    public static void main(String[] args) {
        Long longValue = new Long("80");
        System.out.println(longValue);

        longValue = Long.valueOf("65");
        System.out.println(longValue);

        System.out.println("Min: " + Long.MIN_VALUE + " Max: " + Long.MAX_VALUE);
    }
}
