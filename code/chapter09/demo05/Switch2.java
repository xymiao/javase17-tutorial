public class Switch2 {
    void mete(int day){
        switch (day) {
            case 1, 2 , 3 -> System.out.println("前三天是不是要充实一些？");
            case 4 -> System.out.println("再努力一天？");
            case 5,6 -> System.out.println("前四天都过去了， 周五周六就在努力一下。");
            case 7 ->  System.out.println("把这周没有完成的再完成， 并且开始下一周的任务吧！");
        }
    }
    
    public static void main(String[] args) {
        Switch2 switch2  = new Switch2();
        switch2.mete(1);
        switch2.mete(2);
        switch2.mete(3);
        switch2.mete(4);
        switch2.mete(5);
        switch2.mete(6);
        switch2.mete(7);
    }    
}
