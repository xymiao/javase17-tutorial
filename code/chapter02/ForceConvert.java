public class ForceConvert {
    public static void main(String[] args) {
        short shortValue = 128;
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue); // -128

        shortValue = 129;
        byteValue = (byte)shortValue;
        System.out.println(byteValue); // -127

        shortValue = -129;
        byteValue = (byte)shortValue;
        System.out.println(byteValue); // 127

        byteValue = 0;
        System.out.println(byteValue); 
    }
}
