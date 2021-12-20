import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 定义 map 集合， 保存一组权限
        Map<String, Set<Auth>> map = new HashMap<>();
        
        //权限集合
        Set<Auth> set = new HashSet<>();
        Auth auth1 = new Auth("1", "浏览");
        set.add(auth1);
        Auth auth2 = new Auth("2", "修改");
        set.add(auth2);
        Auth auth3 = new Auth("3", "删除");
        set.add(auth3);
        // 保存 权限集合
        map.put("zhangsan", set);
        System.out.println(map);
    }

}

class Auth {
    private String id;
    private String name;

    public Auth(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auth [id=" + id + ", name=" + name + "]";
    }

}
