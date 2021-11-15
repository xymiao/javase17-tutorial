/**
 * VariableLocal
 */
public class VariableLocal {
    final static String s = "dfdf";
    static {
        int a = 2;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        // i cannot be used 
        int j = 10;
        System.out.println(j);
    }

    public void scope(){
        // j cannot be used
        int i = 100;
        System.out.println(i);
    }
    // i cannot be used

  
}
