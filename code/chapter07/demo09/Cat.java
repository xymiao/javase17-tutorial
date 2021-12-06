public class Cat extends Animal.CatSuper{
    public Cat(){
        System.out.println("Cat 的构造方法执行了！");
    }
    @Override
    public void eat() {
       System.out.println("猫在吃鱼！");
    }
}
