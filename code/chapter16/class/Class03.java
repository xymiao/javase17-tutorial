public class Class03 {
    public static void main(String[] args) throws Exception {
       Class clazz = Class.forName("ClassTest");
       System.out.println( clazz.getModule() );
    }
    
}
class ClassTest{

}