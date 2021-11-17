
public class Demo02If {
    public static void main(String[] args) {
        System.out.println("=========菜单==========");
        System.out.println("1. 活动开始");
        System.out.println("0. 活动结束");
      
        int startFlag = 0;
        if(startFlag == 1){
            System.out.println("当前活动开始了");
        }else{
            System.out.println("活动没有开始呢， 等下再来吧！先关注一下？");
        }
    }
}


