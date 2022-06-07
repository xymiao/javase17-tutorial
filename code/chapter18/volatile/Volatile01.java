public class Volatile01 {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
        test.setContinue(false);
        System.out.println("打印出内容，就停止成功了。但是永远也打印不到了。"
                + "有些等待是没有结果的，就不要在循环了。");
    }
}

class Test {
    private boolean isContinue = true;

    public void setContinue(boolean isContinue) {
        this.isContinue = isContinue;
    }

    public void test() {
        try {
            while (isContinue) {
                System.out.println("当前线程是: " + Thread.currentThread().getName() + "，状态: " + isContinue);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}