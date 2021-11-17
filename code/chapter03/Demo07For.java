public class Demo07For {
    public static void main(String[] args) {
        //完整写法，执行 10 次 我要学 Java
        for(int i = 0; i < 10; i++){
            System.out.print(" 我要学 Java" + ( i + 1));
        }
        System.out.println("");
        //省略初始化
        int i = 0;
        for(; i < 10; i++){
            System.out.print(" 我要学 Java" + ( i + 1));
        }
        //省略循环体
        System.out.println("");
        i = 0;
        for(;;i++){
            if(i == 10){
                break;
            }
            System.out.print(" 我要学 Java" + ( i + 1));
        }
        System.out.println("");
        i = 0;
        //省略所有的参数
        for(;;){
            if(i == 10){
                break;
            }
            System.out.print(" 我要学 Java" + ( i + 1));
            i++;
        }
    }
}

