import java.time.LocalDateTime;

/**
 * 满额减活动
 */
public class ActiveMinus extends ActiveBase {
    public ActiveMinus() {
        this.name = "双 12 满额减";
        this.type = "满额减";
        this.startDate = LocalDateTime.of(2021, 12, 12, 0, 0, 0);
        this.endDate = LocalDateTime.of(2021, 12, 13, 0, 0, 0);
        this.status = "有效";
    }
}
