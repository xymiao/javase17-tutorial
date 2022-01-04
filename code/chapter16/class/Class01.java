public class Class01 {
    public static void main(String[] args) throws Exception {
        String className = "ClassTest";
        Class clazz1 = Class.forName(className);
        System.out.println(clazz1);

        Class clazz2 = Class.forName(ClassTest.class.getModule(), className);
        System.out.println(clazz2);

        Class clazz3 = Class.forName(className, true, ClassTest.class.getClassLoader());
        System.out.println(clazz3);
    }
    
}

class ClassTest{
    
}

