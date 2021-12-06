import java.math.BigDecimal;

public class PayTest {
    public static void main(String[] args) {
        // 业务需要微信支付时：
        WeChatPay weChatPay = new WeChatPay();
        weChatPay.pay("张三", new BigDecimal("1000"));

        // 业务需要支付宝支付时：
        AliPay  aliPay = new AliPay();
        aliPay.pay("李四", new BigDecimal("2000"));

        // 业务需要银联支付时：
        UnionPay  unionPay = new UnionPay();
        unionPay.pay("王二", new BigDecimal("2000"));
    }
}
