public class Demo17Construct {

    private Demo17Construct(){
        // 私有修饰符的构造方法。
    }
    public Demo17Construct(String type) {
        System.out.println(type);
    }

    protected Demo17Construct(int type){

    }

    public static void main(String[] args) {
        // 不能调用
        Demo17Construct d17 = new Demo17Construct();

    }
}

