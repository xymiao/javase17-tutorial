public class KeyBoard implements Usb {

    @Override
    public boolean connect() {
        System.out.println("键盘连接成功。");
        return true;
    }

    @Override
    public void run() {
        if(connect()){
            System.out.println("键盘工作中。");  
        }
    }
    
}
