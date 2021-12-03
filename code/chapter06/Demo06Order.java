public class Demo06Order {
    private boolean payFlag = false;
    void pay(String name){
        System.out.println(name + " " + "已经支付！");
        this.payFlag  = true;
    }
    void send(String name){
        if(!payFlag){
            System.out.println("没有支付无法发货！");
            return ;
        }
        System.out.println( name + " " + "已发货！");
    }
    public static void main(String[] args) {
        Demo06Order demo06Order = new Demo06Order();
        //先发货测试
        demo06Order.send("张三");
        
        //先支付
        demo06Order.pay("张三");
        //再发货
        demo06Order.send("张三");
    }
    
}
