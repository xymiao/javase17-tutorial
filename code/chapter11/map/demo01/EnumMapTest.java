import java.util.EnumMap;
import java.util.Map;

import javax.management.relation.Role;

public class EnumMapTest {
    public enum ROLE {
        user,
        admin
    }

    public static void main(String[] args) {
        Map<ROLE, String> map = new EnumMap<>(Role.class);
        map.put(ROLE.user, "普通用户");
        map.put(ROLE.admin, "管理员");
        System.out.println(map);
    }

}
