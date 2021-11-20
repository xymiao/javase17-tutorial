import java.util.Arrays;

public class Demo07ArraySort {
    public static void main(String[] args) {
        int[] arrayInt = new int[] { 3, 2, 6, 8, 1, 7, 9 };
        Arrays.sort(arrayInt);
        String str = Arrays.toString(arrayInt);
        System.out.println(str);
    }
}
