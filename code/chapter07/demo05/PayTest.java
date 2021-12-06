import java.math.BigDecimal;

public class PayTest {
    public static void main(String[] args) {
        // 业务需要微信支付时：
        PayBase payBase = PayUtil.pay("WeChat");
        payBase.pay("张三", new BigDecimal("1000"));

        // 想要调用 queryPayInfo 必须强转
        String payInfo = ((WeChatPay)payBase).queryPayInfo("张三");
        System.out.println(payInfo);
    }
}
