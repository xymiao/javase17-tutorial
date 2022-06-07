public class Runnable03 {
    public static void main(String[] args) {
        Thread threadLambda = new Thread(()->{
            System.out.println("Lambda 表达式的写法，执行完毕");
        });
        threadLambda.start();
        System.out.println("main 执行完毕");  
    }

}

