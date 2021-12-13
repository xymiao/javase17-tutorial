public class GenericConstructor {
    public <T> GenericConstructor(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        new GenericConstructor(100);
        new GenericConstructor("当前是构造函数的泛型方式！");
        new <String>GenericConstructor("当前是构造函数的泛型方式！");
        //如果泛型和传入的参数不一致就会有错误。 
        new <Integer>GenericConstructor("当前是构造函数的泛型方式！");
    }
}
