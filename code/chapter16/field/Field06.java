import java.lang.reflect.Field;
import java.time.Month;

public class Field06 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f + " " + f.isSynthetic());
        }

        Class clazz2 = Month.class;
        for (Field f : clazz2.getDeclaredFields()) {
            System.out.println(f + " " + f.isSynthetic());
        }
    }
}

class FieldTest {
    FieldTest() {
    }

    private String string1;
    private int int1;
}
