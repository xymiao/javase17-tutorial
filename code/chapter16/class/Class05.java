
public class Class05 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("ClassTest");
        System.out.println(clazz.arrayType());
        System.out.println(clazz.descriptorString());
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getComponentType());

        System.out.println(clazz.getInterfaces());
        System.out.println(clazz.getName());
        System.out.println(clazz.getNestHost());
        System.out.println(clazz.getNestMembers());
        System.out.println(clazz.getProtectionDomain());
        System.out.println(clazz.getRecordComponents());
        System.out.println(clazz.getSigners());
        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getSuperclass());
        System.out.println(clazz.getTypeName());
        System.out.println(clazz.getTypeParameters());
        System.out.println(clazz.toGenericString());
        System.out.println(clazz.toString());
    }
}

class ClassTest {
    @Override
    public String toString() {
        return "ClassTest.toString()";
    }
}
