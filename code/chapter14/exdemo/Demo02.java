public class Demo02 {
    public static void main(String[] args) {
        try {
            String s = "";
            Demo02 demo02 = new Demo02();
            if (args.length > 0) {
                demo02.build(args[0]);
            } else {
                demo02.build(s);
            }
        } catch (ParamException ex) {
            System.out.println("出现异常：" + ex.getMessage());
        } catch (LogicException ex) {
            System.out.println("出现异常：" + ex.getMessage());
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
}
