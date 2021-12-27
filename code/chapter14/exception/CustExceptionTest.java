public class CustExceptionTest {
    public static void main(String[] args) {
        try{
            test(18);
            test(10);
        }catch(CustException ex){
            System.out.println(ex.getMessage());
        }
       
    }

    static void test(int age) throws CustException{
        if(age < 16){
            throw new CustException("age 的参数不能小于 16。");
        }

        System.out.println("来吧。");
    }
}
