public class Thread01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup() + " " 
             + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " "
             + Thread.currentThread().getState());
        Thread thread = new Thread();
        System.out.println(thread.getThreadGroup() + " " + thread.getId() + " " + thread.getName()+ " "
            + thread.getState());
        
    }
}
