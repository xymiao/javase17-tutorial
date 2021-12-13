import java.util.function.Function;

public class TestFunction {
    public String func(String name, Function<String, String> f){
        return f.apply(name);
    }


    public static void main(String[] args) {
        TestFunction testFunction = new TestFunction();
        String msg = testFunction.func("你好啊！", n -> n + "苗子");
        System.out.println(msg);
    }
    
}
