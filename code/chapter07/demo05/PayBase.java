import java.math.BigDecimal;

/** 
 * 这里只是演示类的多态。 这里其实可以使用接口进行定义更加合适。
 * 因为现在还没有说到接口， 等说到接口的时候在详细说说接口里的多态实现。 
 * 接口说过之后， 就可以了解一些设计模式了。 
 */
public class PayBase {
    /**
     * 支付基类。 根据支付人和支付金额
     * @param id 支付人 各个平台都有自己的 openid 用户的身份信息， 这里只是模拟。
     * @param money 支付金额
     * @return 支付是否成功 true 成功， false 失败
     */
    boolean pay(String id, BigDecimal money){
        return false;
    }
}

