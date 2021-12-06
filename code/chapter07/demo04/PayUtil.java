public class PayUtil {
    private PayUtil() {

    }
    public static PayBase pay(String type) {
        PayBase payBase = null;
        switch (type) {
            case "WeChat":
                payBase = new WeChatPay();
                break;
            case "AliPay":
                payBase = new AliPay();
                break;
            case "UnionPay":
                payBase = new UnionPay();
                break;
            default:
                System.out.println("支付错误");
        }
        return payBase;
    }
}
