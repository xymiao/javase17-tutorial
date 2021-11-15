
public class AutoConvert {
    public static void main(String[] args) {
        byte byteValue = 'a';  // 'a' ASCII is 97
        short shortValue = byteValue;  // 97
        int intValue = shortValue; // 97
        long longValue = intValue; // 97
        float floatValue = longValue; // 97
        double doubleValue = floatValue; // 97
        System.out.println(doubleValue);  //97

        char charValue = 'a'; 
        int intCharValue = charValue; // 97
        System.out.println(intCharValue);
    }
}
