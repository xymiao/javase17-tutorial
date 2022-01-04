import java.lang.reflect.Field;

public class Field04 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;

        FieldTest fieldTest = new FieldTest();
        System.out.println("初始化操作");
        for (Field f : clazz.getFields()) {
            switch (f.getType().getName()) {
                case "int":
                    f.setInt(fieldTest, 10);
                    break;
                case "char":
                    f.setChar(fieldTest, 'a');
                    break;
                case "boolean":
                    f.setBoolean(fieldTest, true);
                    break;
                case "double":
                    f.setDouble(fieldTest, 20.0d);
                    break;
                case "float":
                    f.setFloat(fieldTest, 20.0f);
                    break;
                case "short":
                    f.setShort(fieldTest, Short.valueOf("1"));
                    break;
                case "byte":
                    f.setByte(fieldTest, Byte.parseByte("1"));
                    break;
                default:
                    f.set(fieldTest, "object");

            }
        }
        System.out.println("初始化完成，遍历数据");
        for (Field f : clazz.getFields()) {
            System.out.println(f + " " + f.get(fieldTest));
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
