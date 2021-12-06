public class ActiveTest {
    public static void main(String[] args) {
        activeSend();
    }

    public static void activeSend() {
        // 创建一个满额减活动
        ActiveSend activeSend = new ActiveSend();
        // 显示活动信息
        activeSend.showInfo();

        // 判断活动是否开始
        String msg = activeSend.isStart() ? "活动开始了" : "活动没有开始";
        System.out.println(msg);
        activeSend.showInfo();
    }

    public static void activeMinus() {
        // 创建一个满额减活动
        ActiveMinus activeMinus = new ActiveMinus();
        // 显示活动信息
        activeMinus.showInfo();

        // 判断活动是否开始
        String msg = activeMinus.isStart() ? "活动开始了" : "活动没有开始";
        System.out.println(msg);
    }
}
