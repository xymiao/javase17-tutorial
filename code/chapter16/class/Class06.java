
public class Class06 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("ClassTest");
        System.out.println("clazz.getConstructor(String.class): " + clazz.getConstructor(String.class));
        System.out.println("clazz.getConstructors(): " +clazz.getConstructors());
        System.out.println("clazz.getDeclaredConstructor(String.class): " +clazz.getDeclaredConstructor(String.class));
        System.out.println("clazz.getDeclaredConstructors(): " +clazz.getDeclaredConstructors());

        ClassTest classTest  = new ClassTest();
        System.out.println("clazz.getEnclosingConstructor(): " + classTest.object.getClass().getEnclosingConstructor());
    }
}

class ClassTest {
    public Object object;
    ClassTest(){
        class Test{
        }
        object = new Test();
    }
    public ClassTest(String name){
        System.out.println(name);
    }
    @Override
    public String toString() {
        return "ClassTest.toString()";
    }
}
