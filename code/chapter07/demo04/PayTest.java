import java.math.BigDecimal;

public class PayTest {
    public static void main(String[] args) {
        // 业务需要微信支付时：
        PayBase payBase = PayUtil.pay("WeChat");
        payBase.pay("张三", new BigDecimal("1000"));

        // 业务需要支付宝支付时：
        payBase = PayUtil.pay("AliPay");
        payBase.pay("李四", new BigDecimal("2000"));

        // 业务需要银联支付时：
        payBase = PayUtil.pay("UnionPay");
        payBase.pay("王二", new BigDecimal("2000"));
    }
}
