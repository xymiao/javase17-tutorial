public class Computer implements Build{

    @Override
    public void cpu() {
        System.out.println("装配了CPU");
    }

    @Override
    public void ram() {
        System.out.println("装配了内存");
    }

    @Override
    public void hardDisk() {
        System.out.println("装配了硬盘");
    }

    @Override
    public void power() {
        System.out.println("装配了电源");
    }

    @Override
    public void build() {
        mainBoard();
        cpu();
        ram();
        hardDisk();
        power();
        System.out.println("组装完成， 安装系统... 台式机组装好了。");
    }

    @Override
    public void mainBoard() {
        System.out.println("装配了主板");
    }

    
}
