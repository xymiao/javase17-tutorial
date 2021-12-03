package xymiao;

public class Demo18Package {
    private  String hello= "xymiao";
    public String getHello(){
        return this.hello;
    }
    public static void main(String[] args) {
        Demo18Package demo18Package = new Demo18Package();
        System.out.println(demo18Package.getHello());
    }
}
