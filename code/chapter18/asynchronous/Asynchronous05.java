import java.math.BigDecimal;

public class Asynchronous05 {
    private BigDecimal money = new BigDecimal("0");

    public static void main(String[] args) throws InterruptedException {
        Asynchronous05 asynchronous05 = new Asynchronous05();
        asynchronous05.add();
    }

    public synchronized void add() {
        money = money.add(new BigDecimal("100"));
        System.out.println(Thread.currentThread().getName() + " 已存入，余额：" + money);
    }
}
