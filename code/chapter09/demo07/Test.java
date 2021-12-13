import java.util.function.Function;
import java.util.function.IntFunction;

public class Test {
    public int intFunction(int i, IntFunction<Integer> intFun){
        return intFun.apply(i);
    }

    public static void main(String[] args) {
        Test test = new Test();
        int sum = test.intFunction(10, i -> i + i);
        System.out.println(sum);
    }
}
