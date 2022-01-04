import java.lang.reflect.Field;

public class Field03 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;

        FieldTest fieldTest = new FieldTest();
        for (Field f : clazz.getFields()) {
            System.out.println(f + " " + f.get(fieldTest));
        }

        for (Field f : clazz.getFields()) {
            switch (f.getType().getName()) {
                case "int":
                    System.out.println(f.getName() + " = " + f.getInt(fieldTest));
                    break;
                case "char":
                    System.out.println(f.getName() + " = '" + f.getChar(fieldTest) + "'");
                    break;
                case "boolean":
                    System.out.println(f.getName() + " = " + f.getBoolean(fieldTest));
                    break;
                case "double":
                    System.out.println(f.getName() + " = " + f.getDouble(fieldTest));
                    break;
                case "float":
                    System.out.println(f.getName() + " = " + f.getFloat(fieldTest));
                    break;
                case "short":
                    System.out.println(f.getName() + " = " + f.getShort(fieldTest));
                    break;
                case "byte":
                    System.out.println(f.getName() + " = " + f.getByte(fieldTest));
                    break;
                default:
                    System.out.println(f.getName() + " = " + f.get(fieldTest));

            }
        }
    }
}

class FieldTest {
    FieldTest() {
    }
    public String string1;
    public int int1;
    public char char1;
    public boolean boolean1;
    public double double1;
    public float float1;
    public short short1;
    public byte byte1;
}
