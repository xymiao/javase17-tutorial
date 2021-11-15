/**
 * Boolean 使用
 */
public class BooleanObject {

    public static void main(String[] args) {
        Boolean booleanValue = new Boolean("true");
        System.out.println(booleanValue);

        booleanValue = false;
        System.out.println(booleanValue);
        // only use true | false
        booleanValue = Boolean.parseBoolean("yes");
        System.out.println(booleanValue);

        boolean boolValue = Boolean.valueOf("true");
        System.out.println(boolValue);
    }
}
