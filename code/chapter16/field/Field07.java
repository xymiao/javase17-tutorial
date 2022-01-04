import java.lang.reflect.Field;

public class Field07 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;
        Field field = clazz.getField("string1");
        FieldTest fieldTest = new FieldTest();

        field.set(fieldTest, "value");
        System.out.println(field.get(fieldTest));
    }
}

class FieldTest {
    FieldTest() {
    }

    private String string1;
    private int int1;
}
