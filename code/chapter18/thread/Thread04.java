public class Thread04 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try{
                    Thread.sleep(50);
                }catch(Exception e){}
                
                System.out.print(" T" + i);
            }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("sleep");
            Thread.sleep(500);
            Thread.sleep(500, 100);
        }
    }
}
