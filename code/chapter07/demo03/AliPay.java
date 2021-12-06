import java.math.BigDecimal;

public class AliPay {
    public String pay(String name, BigDecimal money){
        //调用支付宝支付的 SDK
        System.out.println("支付宝支付信息\n" + name + " 支付了 " + money);
        return "支付成功了";
    }
}
