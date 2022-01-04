import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class Field09 {
    public static void main(String[] args) throws Exception {
        Class clazz = UserInfo.class;
        Field[] fields = clazz.getDeclaredFields();

        StringBuffer sb = new StringBuffer();
        sb.append("select ");
        int i = 0;
        for (Field field : fields) {
            i ++;
            sb.append(getFieldName(field));
            if(i < fields.length ){
                sb.append(", ");
            }
        }
        sb.append(" from ");
        sb.append(getClassName(clazz));
        
        System.out.println(sb);
    }

    public static String getClassName(Class<?> clazz){
       TableName tableName = clazz.getAnnotation(TableName.class);
       if(tableName == null){
           return clazz.getName();
       }else{
            return tableName.value();
       }
    }

    public static String getFieldName(Field field){
        FieldName FieldName = field.getAnnotation(FieldName.class);
        if(FieldName == null){
            return field.getName();
        }else{
             return FieldName.value();
        }
     }
}

@TableName(value="user_info")
class UserInfo {
    private String uid;
    private String uname;
    private int age;
    private String birthday;
    private String auth;
    private LocalDateTime created;
    @FieldName(value="nick_name")
    private String nickName;
}

@Documented
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableName{
    String value();
}

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldName{
    String value();
}

