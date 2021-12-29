public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        try {
            demo05.build("");
        } catch (ParamException | LogicException ex) {
            try {
                // 异常的时候， 处理一些其他的业务逻辑。比方说些日志。等等
                demo05.again("出现异常：" + ex.getMessage());
            } catch (ParamException pex) {
                System.out.println(pex.getMessage());
            }
        }
    }

    void build(String s) throws ParamException, LogicException {
        if (s == null || "".equals(s)) {
            throw new ParamException("参数错误，请验证您的参数是否正确!");
        }

        if ("dev".equals(s)) {
            throw new LogicException("线上系统不允许使用 dev 环境!");
        }

        System.out.println("线上环境构建成功!");
    }
    
    void again(String s) throws ParamException {
        System.out.println(s);
        throw new ParamException("我是为了演示异常中再次抛出异常， 没有任何实际的意义");
    }
}
