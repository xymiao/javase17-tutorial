public class Demo04This {
    private String name;
    public String getName(){
       return this.name;
    }
    public Demo04This getDemo04This(String name){
        this.name = name;
        return this;
    }
    public static void main(String[] args) {
        Demo04This demo04This = new Demo04This();
        String name = demo04This.getDemo04This("张三").getName();
        System.out.println(name);
    }
}

