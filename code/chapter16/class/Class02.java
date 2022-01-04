public class Class02 {
    public static void main(String[] args) throws Exception{
        Object object = Class.forName("ClassTest").newInstance();
        System.out.println(object);

        object = Class.forName("ClassTest").getDeclaredConstructor().newInstance();
        System.out.println(object);
    }
    
}

class ClassTest{
    @Override
    public String toString() {
        return "ClassTest.toString()";
    }
}
