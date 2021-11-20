public class Demo04Array {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 2, 3};
        for (int i : arrayInt) {
            System.out.print(i + "\t");
        }
        System.out.println();
        arrayInt[0] = 5;
        arrayInt[1] = 6;
        arrayInt[2] = 7;
        for (int i : arrayInt) {
            System.out.print(i + "\t");
        }
        System.out.println();
        // 下面两个是错误的索引 引用。
        arrayInt[-1] = 1;
        arrayInt[3] = 1;
    }
}
