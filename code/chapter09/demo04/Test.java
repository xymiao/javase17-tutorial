public class Test {

    public void sum(int x, int y, SumInterface sumInterface){
       int sum = sumInterface.sum(x, y);
       System.out.printf("lambda ：\n%d + %d 的和是 %d\n", x, y, sum);
    }
    public static void main(String[] args) {
        Test test = new Test();
        int x = 10, y = 20;
        test.sum(x, y, (int a, int b) -> x + y);
    }
}
