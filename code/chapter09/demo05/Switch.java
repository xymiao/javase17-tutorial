public class Switch {
    void mete(){
        int day = 1;
        switch (day) {
            case 1:
            case 2:
            case 3:
                System.out.println("前三天是不是要充实一些？");
                break;
            case 4:
                System.out.println("再努力一天？");
                break;
            case 5:
            case 6:
                System.out.println("前四天都过去了， 周五周六就在努力一下。");
                break;
            case 7:
                System.out.println("把这周没有完成的再完成， 并且开始下一周的任务吧！");
                break;
        }
    }
    public static void main(String[] args) {
        Switch switch1  = new Switch();
        switch1.mete();
    }    
}
