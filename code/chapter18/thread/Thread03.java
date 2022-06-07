public class Thread03 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.print(" T" + i);
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.print(" M" + i);;
        }
    }
}
