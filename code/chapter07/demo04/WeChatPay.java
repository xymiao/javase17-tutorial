import java.math.BigDecimal;

public class WeChatPay extends PayBase {
    public boolean pay(String name, BigDecimal money){
        //调用微信支付的 SDK
        System.out.println("微信支付信息\n" + name + " 支付了 " + money);
        return true;
    }
}
