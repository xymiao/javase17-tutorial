import java.time.LocalDateTime;

/**
 * 活动的基类
 */
public class ActiveBase {
    // 活动的类型
    String type;
    // 活动的名称
    String name;
    // 活动的开始时间
    LocalDateTime startDate;
    // 活动的结束时间
    LocalDateTime endDate;
    // 活动的状态 值为 有效 | 无效
    String status;

    void showInfo() {
        System.out.println("活动信息\n类型：" + type + "\n名称：" + name + "\n时间："
                + startDate.toString() + " - " + endDate.toString() + "\n状态：" + status);
    }

    boolean isStart() {
        LocalDateTime currDateTime = LocalDateTime.now();
        if ("有效".equals(status) &&
                (startDate.isBefore(currDateTime) && endDate.isAfter(currDateTime))) {
            return true;
        } else {
            return false;
        }
    }
}
