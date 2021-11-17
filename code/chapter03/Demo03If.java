
public class Demo03If {
    public static void main(String[] args) {
        System.out.println("=========菜单==========");
        System.out.println("1. 活动开始");
        System.out.println("0. 活动结束");
        
        int memberFlag = 0; // 1  新会员 0 老会员
        int startFlag = 0;  // 1 已开始 0 未开始
        if(startFlag == 1){
            System.out.println("当前活动开始了");
        }else if(memberFlag == 1){
            System.out.println("新会员活动开始了");
        }else{
            System.out.println("活动没有开始呢， 等下再来吧！先关注一下？");
        }
    }
}


