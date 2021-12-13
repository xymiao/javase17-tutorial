public class Test {
    public static void main(String[] args) {
        SumInterface sumInterface = (int x, int y) -> {
            int sum = x + y;
            return sum;
        };
        int x = 10, y = 20;
        int sum = sumInterface.sum(x, y);
        System.out.printf("lambda1 ：\n%d + %d 的和是 %d\n", x, y, sum);
      
        // 因为方法体就一句话， 可以直接写表达式， 而不需要是一段方法块。
        sumInterface = (int a, int b) -> x + y;
        sum = sumInterface.sum(x, y);
        System.out.printf("lambda2 : \n%d + %d 的和是 %d", x, y, sum);
    }
}
