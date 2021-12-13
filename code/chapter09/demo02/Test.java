public class Test {
    public static void main(String[] args) {
        SumInterface sumInterface = new SumInterface(){
                public int sum(int x, int y) {
                    return x + y;
                };
        };
        
        int x = 30, y = 40;
        int sum = sumInterface.sum(x, y);
        System.out.printf("匿名函数的方式：\n%d + %d 的和是 %d", x, y, sum);
    }
}
