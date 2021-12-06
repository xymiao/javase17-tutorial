public class ActiveTest2 {
    public static void main(String[] args) {
        ActiveSend activeSend = new ActiveSend();
        if(activeSend instanceof ActiveBase){
            System.out.println("ActiveSend 是 ActiveBase 的子类");
        }
    }
}
     
