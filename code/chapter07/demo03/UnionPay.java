import java.math.BigDecimal;

public class UnionPay {
    public String pay(String name, BigDecimal money){
        //调用银联支付的 SDK
        System.out.println("银联支付信息\n" + name + " 支付了 " + money);
        return "支付成功了";
    }
}
