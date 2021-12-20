import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
    public static void main(String[] args) {
        // 定义 map 集合， 保存一组权限
        Map<String, Auth> map = new HashMap<>();
        Auth auth1 = new Auth("1", "浏览");
        map.put(auth1.getId(), auth1);
      
        Auth auth2 = new Auth("2", "修改");
        map.put(auth2.getId(), auth2);
       
        Auth auth3 = new Auth("3", "删除");
        map.put(auth3.getId(), auth3);

        Map<String, Map<String, Auth>> mapUser = new HashMap<>();
        mapUser.put("zhangsan", map);

        System.out.println(mapUser);
        //取出来张三的权限
        Map<String, Auth> mapAuth = mapUser.get("zhangsan");
        //判断是否包含删除的权限
        Auth authDel = mapAuth.get("3");
        if(authDel != null){
            System.out.println("包含删除的权限。");
        }
        
        System.out.println("删除 编码3 的删除权限");
        map.remove("3");
        mapUser.put("zhangsan", map);
        authDel = mapAuth.get("3");
        if(authDel != null){
            System.out.println("包含删除的权限。");
        }else{
            System.out.println("不包含删除的权限。");
        }
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
