public class Test {
    public static void main(String[] args) {
        one();
    }

    public static void one() {
        SumInterface sumInterface = new SumClass();
        int x = 10, y = 20;
        int sum = sumInterface.sum(x, y);
        System.out.printf("%d + %d 的和是 %d", x, y, sum);
    }
}
