/**
 * Special
 */
public class Special {
    
    public static void main(String[] args) {
        //调用方法也是使用圆括号。Special() 是构造方法。
        new Special().sum(1, 1);
    }
    //方法名后跟圆括号
    public int sum(int i, int j){
        return i + (int)j;
    }

    int index = 0; String name = "苗子说全栈";
    int i = 0,
    j = 0, k = 0;
   public void methodName(){
       //这个是方法内容
   }
   static{
       //这个是静态代码块。
   }

   {
       //也可以这样写
   }
}