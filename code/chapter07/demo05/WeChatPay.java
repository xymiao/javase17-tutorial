import java.math.BigDecimal;

public class WeChatPay extends PayBase {
    public boolean pay(String name, BigDecimal money){
        //调用微信支付的 SDK
        System.out.println("微信支付信息\n" + name + " 支付了 " + money);
        return true;
    }
    public String queryPayInfo(String name){
        System.out.println("微信已支付信息\n" + name + " 已经支付成功了！");
        return "支付成功了";
    }
}
