public class Demo12LocalVariable {
    private boolean isFlag = false;
    public void setFlag(){
        this.isFlag = true;
    }

    public void test(){
        if(isFlag){
            int index = 0;
            for(int i = 0; i < 10; i ++){
                index++;
            }
            System.out.println(index);
        }
        //index 无法在这访问
    }
    public static void main(String[] args) {
        Demo12LocalVariable d = new Demo12LocalVariable();
        d.setFlag();
        d.test();
    }
}

