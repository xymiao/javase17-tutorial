public class Demo06DoWhile {
    public static void main(String[] args) {
        int count = 0;
        boolean isLearn = false;
        do{
            if(count == 10){
                isLearn = true;
            }
            count ++;
            System.out.println("学会了吗？ 会不会也要先学一遍： " + count);
        }while(isLearn);

        do{
            if(count == 10){
                isLearn = true;
            }
            count ++;
            System.out.println("学会了吗？ 继续学： " + count);
        }while(!isLearn);
    }
}

