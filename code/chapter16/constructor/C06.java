import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;

public class C06 {
    public static void main(String[] args) throws Exception {
        Constructor constructor = ConstructorTest.Test2.class.getDeclaredConstructor(ConstructorTest.class);
        AnnotatedType annotatedType =  constructor.getAnnotatedReceiverType();
        System.out.println(annotatedType);

        AnnotatedType at =   constructor.getAnnotatedReturnType();
        System.out.println(at);

    }
}

class ConstructorTest {
    
    class Test2{
        @Test("Test2()")
        Test2(ConstructorTest ConstructorTest.this){}
    }
}

@Target(value = {ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) 
@interface Test{
    String value() default "";
}
