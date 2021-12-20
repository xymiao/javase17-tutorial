import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        // 1. 保存 10 个 用户的信息。
        int index = 1;
        for (int i = 0; i < 10; i++) {
            boolean b = userService.addUser(new App().randomUser(index));
            if(b){
                System.out.print(index + "成功！ ");
            }
            index ++;
        }
        // 遍历一下用户的列表
        System.out.println();
        List<UserInfo> list = userService.showList();
        System.out.println("当前用户列表（" +list.size()+ "）：");
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        } 
        
        // 删除一个用户
        System.out.println("删除用户： 2");
        userService.delUser("2");

        // 查看删除之后的列表
        list = userService.showList();
        System.out.println("当前用户列表（" +list.size()+ "）：");
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
        
        // 获得单个用户的信息
        System.out.println("获得用户： 5");
        UserInfo userInfo = userService.getUser("5");
        System.out.println(userInfo);

    }

    private UserInfo randomUser(int index){
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(String.valueOf(index));
        userInfo.setName(getRandomChar() + getRandomChar());
        userInfo.setStatus("有效");
        return userInfo;
    }

    public String getRandomChar() {
        Random random = new Random();

        int highCode = (176 + Math.abs(random.nextInt(39))); //B0 + 0~39(16~55) 一级汉字所占区
        int lowCode = (161 + Math.abs(random.nextInt(93))); //A1 + 0~93 每区有94个汉字

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(highCode)).byteValue();
        b[1] = (Integer.valueOf(lowCode)).byteValue();
       
        String str = "";
        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    
}
