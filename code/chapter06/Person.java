/**
 * 人的类信息
 */
public class Person {
    Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println(this.name + ", 年龄：" + this.age + ", 性别：" + this.sex);
    }

    private String name;
    private int age;
    private String sex;

    public void eat() {
        System.out.println(this.name + " 在吃饭");
    }

    public void sleep() {
        System.out.println(this.name + " 在睡觉");
    }

    public void study() {
        System.out.println(this.name + " 在学习");
    }

}
