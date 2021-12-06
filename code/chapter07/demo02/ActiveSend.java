import java.time.LocalDateTime;

/**
 * 满额送活动
 */
public class ActiveSend extends ActiveBase {
    public ActiveSend() {
        this.name = "双 12 满额送";
        this.type = "满额送";
        this.startDate = LocalDateTime.of(2021, 12, 12, 0, 0, 0);
        this.endDate = LocalDateTime.of(2021, 12, 13, 0, 0, 0);
        this.status = "有效";
    }
    
    public boolean isStart() {
        this.startDate = LocalDateTime.now().minusHours(1);
        this.endDate = LocalDateTime.now().plusHours(1);
        return super.isStart();
    }
    /*
    public boolean isStart() { 
        if ("有效".equals(status)) {
            return true;
        } else {
            return false;
        }
    }
    */
}
