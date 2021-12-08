public interface Usb {
    /**
     * USB 的接口连接
     * @return true 连接成功  false 连接失败
     */
    boolean connect();
    
    /**
     * 开始工作
     */
    void run();
}
