public class Demo10InstanceVariable {
    private String name;
    private int readNum;

    Demo10InstanceVariable() {
        this.name = "苗子";
        this.readNum = 0;
        System.out.println(name + " readNum: " + readNum);
    }

    public void addReadNum() {
        readNum++;
        System.out.println("当前阅读：" + readNum);
    }

    {
        readNum++;
        addReadNum();
    }

    public void seeReadNum() {
        if (readNum == 0) {
            System.out.println("清醒一下吧。为啥还是 0。");
        } else {
            //越多阅读越多转发和关注， 转发和关注有能增加更多的阅读。 良性循环。 
            addReadNum();
        }
    }
    public static void main(String[] args) {
        Demo10InstanceVariable d = new Demo10InstanceVariable();
        System.out.println("注意观察执行顺序");
        d.seeReadNum();
        d.addReadNum();
        d.seeReadNum();
        System.out.println(d.readNum);
    }
}
