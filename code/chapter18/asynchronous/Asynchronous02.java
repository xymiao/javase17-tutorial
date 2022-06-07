import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Asynchronous02 {
    private BigDecimal money = new BigDecimal("0");

    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("菜单");
            System.out.println("1. 存入金额 100");
            System.out.println("2. 取出金额 100");
            System.out.println("3. 查询当前余额");
            System.out.println("q. 退出");
            Asynchronous02 asynchronous02 = new Asynchronous02();
            String line;
            while (scanner.hasNextLine() && (line = scanner.nextLine()) != null) {
                System.out.println("=================");
                switch (line) {
                    case "1":
                        for (int i = 0; i < 100; i++) {
                            asynchronous02.add(asynchronous02);
                        }
                        break;
                    case "2":
                        asynchronous02.minus(asynchronous02);
                        break;
                    case "3":
                        System.out.println("当前余额：" + asynchronous02.money);
                        break;
                    default:
                        System.out.println("退出系统成功");
                        System.exit(0);
                }
            }
        } catch (Exception e) {
        }
    }

    public void add(Asynchronous02 asynchronous02) {
        new Thread(() -> {
            asynchronous02.money = asynchronous02.money.add(new BigDecimal("100"));
            System.out.println("已存入，余额：" + asynchronous02.money);
        }).start();
    }

    public void minus(Asynchronous02 asynchronous02) {
        new Thread(() -> {
            asynchronous02.money = asynchronous02.money.add(new BigDecimal("100").negate());
            System.out.println("已取出，余额：" + asynchronous02.money);
        }).start();
    }

}
