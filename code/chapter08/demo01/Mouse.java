public class Mouse implements Usb {

    @Override
    public boolean connect() {
        System.out.println("鼠标连接成功。");
        return true;
    }

    @Override
    public void run() {
        if(connect()){
            System.out.println("鼠标开始工作了。");
        }
    }
    
}
