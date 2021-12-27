public class ThrowableTest {
    public static void main(String[] args) throws Throwable {
        Throwable throwable = new Throwable();  
        System.out.println(throwable);
        Throwable throwable2 = new Throwable("这个是演示的 message 信息");  
        System.out.println(throwable2);
        Throwable throwable3 = new Throwable("演示 message 信息， 以及提供异常信息。", new  NullPointerException());  
        System.out.println(throwable3);
        throw throwable3;
    }   
}
