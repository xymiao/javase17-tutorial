public class Demo13ClassVariableTest {
    public static void main(String[] args) {
        // 测试步骤：
        // 1. 先直接获得当前的版本信息
        Demo13ClassVariable.getVersion2();

        // 2. 实例化第一个类
        Demo13ClassVariable d = new Demo13ClassVariable();
        d.getVersion(d);
        // 2.1 为了测试静态变量的对象共享， 就更改这个值。 在用另外一个对象进行调用静态方法获得静态变量值。
        d.setVersion("2", "1次迭代");

        // 3. 实例化第二个类
        System.out.println("d2 start");
        Demo13ClassVariable d2 = new Demo13ClassVariable();
        // 注意查看控制台的输出信息
        d2.getVersion(d2);
        System.out.println("d2 end");

        // 4. 实例化第三个类
        System.out.println("d3 start");
        Demo13ClassVariable d3 = new Demo13ClassVariable();
        d3.getVersion(d3);
        System.out.println("d3 end");

        Demo13ClassVariable.getVersion2();
    }

}
