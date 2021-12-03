public class Demo16Car {
    private String name = "自行车";
    public Demo16Car(){
        super();
    }
    public Demo16Car(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + "，已经开起来了，坐好了！");
    }
}
