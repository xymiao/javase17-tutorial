import java.util.LinkedList;
import java.util.List;

public class UserService {
    //保存用户的数据
    private static List<UserInfo> list = new LinkedList<>();
   
    public boolean addUser(UserInfo userInfo){
        return list.add(userInfo);
    }

    public boolean delUser(String uid){
        for (UserInfo userInfo : list) {
            if(uid.equals(userInfo.getUid())){
                return list.remove(userInfo);
            }
        }
        return false;
    }

    public UserInfo getUser(String uid){
        for (UserInfo userInfo : list) {
            if(uid.equals(userInfo.getUid())){
                return userInfo;
            }
        }
        return null;
    }

    public List<UserInfo> showList(){
        return list;
    }
}
