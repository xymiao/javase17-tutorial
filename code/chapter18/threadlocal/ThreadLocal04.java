public class ThreadLocal04 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("value 值, 测试 remove 方法的使用。");
        System.out.println(threadLocal.get());

        threadLocal.remove();
        System.out.println("删除之后的值为: " + threadLocal.get());
    }

}
