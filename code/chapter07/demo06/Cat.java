public class Cat extends Animal{
    public Cat(){
        super.name = "猫";
    }

    @Override
    public void eat() {
        System.out.println(super.name + ", 正在吃鱼！");
    }
    
}
