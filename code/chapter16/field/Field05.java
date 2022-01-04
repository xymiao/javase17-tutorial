import java.lang.reflect.Field;

public class Field05 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;

        for (Field f : clazz.getFields()) {
            System.out.println(f + " " + f.isEnumConstant() );
        }
        
        Class clazz2 = FieldEnum.class;
        for (Field f : clazz2.getFields()) {
            System.out.println(f + " " + f.isEnumConstant() );
        }
    }
}

class FieldTest {
    FieldTest() {
    }
    public String string1;
    public int int1;
    public  FieldEnum fieldEnum;

   
}

enum FieldEnum {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    FieldEnum(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}

