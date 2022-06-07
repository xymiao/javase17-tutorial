import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Asynchronous03 {
    private BigDecimal money = new BigDecimal("0");

    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("菜单");
            System.out.println("1. 存入金额 100");
            System.out.println("2. 取出金额 100");
            System.out.println("3. 查询当前余额");
            System.out.println("q. 退出");
            Asynchronous03 asynchronous03 = new Asynchronous03();
            String line;
            while (scanner.hasNextLine() && (line = scanner.nextLine()) != null) {
                System.out.println("=================");
                switch (line) {
                    case "1":
                        for (int i = 0; i < 40; i++) {
                            asynchronous03.add(asynchronous03);
                        }
                        break;
                    case "2":
                    asynchronous03.minus(asynchronous03);
                        break;
                    case "3":
                        System.out.println("当前余额：" + asynchronous03.money);
                        break;
                    default:
                        System.out.println("退出系统成功");
                        System.exit(0);
                }
            }
        } catch (Exception e) {
        }
    }

    public void add(Asynchronous03 asynchronous03) {
        new Thread(() -> {
            synchronized(this){
                asynchronous03.money = asynchronous03.money.add(new BigDecimal("100"));
                System.out.println(Thread.currentThread().getName() + " 已存入，余额：" + asynchronous03.money);
            }
        }).start();
    }

    public void minus(Asynchronous03 asynchronous03) {
        new Thread(() -> {
            asynchronous03.money = asynchronous03.money.add(new BigDecimal("100").negate());
            System.out.println("已取出，余额：" + asynchronous03.money);
        }).start();
    }

}
