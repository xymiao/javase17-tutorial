public class Demo03 {
    public static void main(String[] args) {
        try {
            String s = "";
            Demo03 demo03 = new Demo03();
            if (args.length > 0) {
                demo03.build(args[0]);
            } else {
                demo03.build(s);
            }
        } catch (Exception ex) {
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
