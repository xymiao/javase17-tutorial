import java.math.BigDecimal;

public class Asynchronous04 {
    private BigDecimal money = new BigDecimal("0");

    public static void main(String[] args) throws InterruptedException {
        Asynchronous04 asynchronous04 = new Asynchronous04();
        asynchronous04.add();
        // 执行反编译命令查看 add 的字节码
        // javap -c -v Asynchronous04.class
    }

    public void add() {
        synchronized (this) {
            money = money.add(new BigDecimal("100"));
            System.out.println(Thread.currentThread().getName() + " 已存入，余额：" + money);
        }
    }
}
