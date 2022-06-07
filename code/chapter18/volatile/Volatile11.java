public class Volatile11 {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 0;
    public static int x = 0;
    public static int y = 0;
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
      
        for (;;) {
            count ++;
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            Thread threadA = new Thread(() -> {
                a = 1;
                c = d;
                e = 102;
                x = b;
            });
            Thread threadB = new Thread(() -> {
                b = 1;
                d = e;
                f = 203; 
                y = a;
            });
            threadA.start();
            threadB.start();
            threadA.join();
            threadB.join();

            if (x == 0 && y == 0) {
                System.out.println(
                    count + ", " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + x + ", " + y);
                break;
            } else {
                System.out.println(
                    count + ", " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + x + ", " + y);
            }

        }
    }
}
