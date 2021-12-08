public class Test {
    public static void main(String[] args) {
        Usb usb = new KeyBoard();
        usb.run();
        if(usb instanceof Usb){
            System.out.println("KeyBoard 是 USB 接口的实现");
        }

        usb = new Mouse();
        usb.run();

        if(usb instanceof Usb){
            System.out.println("Mouse 是 USB 接口的实现");
        }
    }
}
