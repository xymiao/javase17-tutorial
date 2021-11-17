
public class Demo02Switch {
    public static void main(String[] args) {
        String type = "zhangsan";
        switch (type) {
            case "lisi":
                System.out.println("李四， 里面有个孙大圣！");
                break;
            case "wanger":
                System.out.println("王二，被人遗忘的六娃！");
                break;
            case "zhangsan":
                System.out.println("张三， 法外狂徒！");
                break;
            default: {
                System.out.println("没有匹配到的默认选项！");
            }
        }
    }
}

