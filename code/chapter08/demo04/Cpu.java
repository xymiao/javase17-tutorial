public interface Cpu {
    void cpu();

    public static void info(){
       System.out.println("CPU 的信息描述！");
    }
    default void version(){
        test();
        System.out.println("版本： 1 代");
    }

    private  void  test(){
        System.out.println("测试内容");
    }
}
