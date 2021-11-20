
public class Demo08ArrayTwo {
    public static void main(String[] args) {

        int[][] array3 = new int[][]{{1, 2},{3, 4}};
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        } 

        int[][] array4 = new int[2][3];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = i + j;
            }
        } 
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        } 

        int array5[][] = new int[][]{{2, 3}, {5,6}};
        int array6[][] = new int[2][3];
    }
}

