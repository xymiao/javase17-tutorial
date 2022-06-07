public class ThreadLocal01 {

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        System.out.println("默认构造函数，get 值为: " + threadLocal.get());
        // 设置当前线程变量值为 100
        System.out.println("设置变量值");
        threadLocal.set(100);
        System.out.println("获取了变量值: " + threadLocal.get());

        System.out.println("不同的使用方式");
        ThreadLocal<UserInfo> threadLocalUserInfo = new ThreadLocal<>();
        UserInfo userInfo = new UserInfo("1", "测试账号");
        threadLocalUserInfo.set(userInfo);
        System.out.println("当前值: " + threadLocalUserInfo.get());
    }
}

class UserInfo {
    public String uid;
    public String nickName;

    public UserInfo(String uid, String nickName) {
        this.uid = uid;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserInfo [nickName=" + nickName + ", uid=" + uid + "]";
    }
}
