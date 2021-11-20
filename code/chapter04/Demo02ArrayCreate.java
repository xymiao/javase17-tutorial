/**
 * Demo01Array
 */
public class Demo02ArrayCreate {
    public static void main(String[] args) {
        int[] arrays = new int[] { 1, 2, 3, 4 };
        for (int i : arrays) {
            System.out.print("int: " + i + " ");
        }
        System.out.println("");
        int[] arrays2 = new int[5];
        for (int i : arrays2) {
            System.out.print("int: " + i + " ");
        }
    }
}
