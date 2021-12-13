public class Test {
    static int test(){
       System.out.println("Test.test() run");
       return 1;
    }
    public static void main(String[] args) {
        FiTest fiTest = () ->{
            System.out.println("Test run!");
        };
        fiTest.run();  
        
        var a = Test::test;
        System.out.println(a);
        
        Object object = (FiTest)() -> {
            System.out.println("Test and Object run!");
        };
        ((FiTest)object).run();
    }
}
