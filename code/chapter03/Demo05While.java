public class Demo05While {
    public static void main(String[] args) {
        int count = 0;
        boolean isLearn = false;
        while(isLearn){
            System.out.println("我将不执行！");
        }
        while(!isLearn){
            if(count == 10){
                isLearn = true;
            }
            count ++;
            System.out.println("学会了吗？ 没有继续在来一遍： " + count);
        }

        while(isLearn){
            System.out.println("我将一直执行。" + count++);
        }
    }
}
