public class Demo11LocalVariable {

    public void test(){
        String name = "慢慢讲 Java";
        System.out.println(name);
    }
    // name 这里也无法使用 name
    
    {
        // name 这里也无法使用 name, 但是可以重新定义 name
        String name = "苗子";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Demo11LocalVariable d = new Demo11LocalVariable();
        d.test();
       // d.name;  这里就不能使用name
    }
    
}
