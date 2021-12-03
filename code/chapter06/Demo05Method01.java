
public class Demo05Method01 {
    /**
     * 空方法
     */
    void demoMethod(){

    }
    /**
     * 带有一个参数的方法
     * @param name 名字
     */
    void demoMethod2(String name){
        System.out.println("忽略 " + name + "吧， 我就是个输出内容。");
    }

    /**
     * 返回加油信息
     * @return 加油的字符串信息
     */
    String sayRefuel(){
        return "学习 Java 很容易， 苗子和你一起来学习。关注点赞加收藏！";
    }

    /**
     * 求和 
     * @param x 第一个数
     * @param y 第二个数
     * @return 返回两个数的和
     */
    int sum(int x, int y){
        return x + y;
    }

    /**
     * 可变参数
     * @param n 字符串参数
     */
    void multiple(String... n){
        for (String str : n) {
            System.out.println(str);
        }
    } 

    private String getHiPrivate(){
        return "Hi private!";
    }

    protected String getHiProtected(){
        return "Hi protected!";
    }
    
    public String getHiPublic(){
        return "Hi public !";
    }
}

