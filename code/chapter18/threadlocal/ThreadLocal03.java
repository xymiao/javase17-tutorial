public class ThreadLocal03 {
    public static void main(String[] args) {
        MyThreadLocal myThreadLocal = new MyThreadLocal();
        System.out.println("实现返回默认值: " + myThreadLocal.get());
    }

}

class MyThreadLocal extends ThreadLocal<String> {
    @Override
    protected String initialValue() {
        return "默认值";
    }
}