import java.time.LocalDateTime;

public class Demo01Switch {
    public static void main(String[] args) {
        int week = LocalDateTime.now().getDayOfWeek().getValue();
        switch (week) {
            case 1:
                System.out.println("做点周一该做的事情， 写 Java 教程！");
                break;
            case 2:
                System.out.println("做点周二该做的事情， 写 Java 教程！");
                break;
            case 3:
                System.out.println("做点周三该做的事情， 继续写 Java 教程！");
                break;
            case 4:
                System.out.println("做点周四该做的事情， 再继续写 Java 教程！");
                break;
            case 5:
                System.out.println("做点周五该做的事情， 再来写 Java 教程！");
                break;
            case 6:
                System.out.println("做点周六该做的事情， 继续写 Java 教程！");
                break;
            case 7:
                System.out.println("做点周日该做的事情， 再继续写 Java 教程！");
                break;
            default: {
                System.out.println("今天周几来着，不管了， 继续写 Java 教程！");
            }
        }
    }
}
