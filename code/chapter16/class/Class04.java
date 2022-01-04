package test;
public class Class04 {
    public static void main(String[] args) throws Exception {
       Class clazz = Class.forName("test.ClassTest");
       System.out.println( clazz.getPackage());
       System.out.println( clazz.getPackageName());
    }
    
}

class ClassTest{

}