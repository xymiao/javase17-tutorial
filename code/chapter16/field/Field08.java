import java.lang.reflect.Field;

public class Field08 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;
        FieldTest fieldTest = new FieldTest();
        Field field = clazz.getDeclaredField("string1");

        field.setAccessible(true);
        field.set(fieldTest, "value");
        System.out.println(field.get(fieldTest));
    }
}

class FieldTest {
    FieldTest() {
    }

    private String string1;
}
