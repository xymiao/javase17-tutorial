import java.lang.reflect.Field;

public class Field02 {
    public static void main(String[] args) throws Exception {
        Class clazz = FieldTest.class;
        Field field = clazz.getField("status");
        System.out.println(field);
        Object obj = field.get(new FieldTest("status 的值"));
        System.out.println(obj);
    }
}

class FieldTest {
    public FieldTest(String status) {
        this.status = status;
    }

    public String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
