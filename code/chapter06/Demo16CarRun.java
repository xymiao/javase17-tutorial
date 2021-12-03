public class Demo16CarRun {
    
    public static void main(String[] args) {
        Demo16Car car = new Demo16Car();
        car.run();

        Demo16Car car2 = new Demo16Car("摩托车");
        car2.run();

        Demo16Car car3 = new Demo16Car("小汽车");
        car3.run();

        Demo16Car car4 = new Demo16Car("新能源");
        car4.run();
    }
}
