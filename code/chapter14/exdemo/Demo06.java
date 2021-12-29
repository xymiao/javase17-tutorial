public class Demo06 {
    public static void main(String[] args) {
        Demo06 demo06 = new Demo06();
        try {
            demo06.again(args.length == 0 ? "": args[0]);
            System.out.println("继续执行业务，查看我的输出。");
        } catch (ParamException ex) {
            System.out.println("出现异常：" + ex.getMessage());
        } finally{
            System.out.println("处理一些善后的操作");
        }
    }
    
    void again(String s) throws ParamException {
        if(s == null || "".equals(s)){
            throw new ParamException("参数为空抛出异常");
        }
        System.out.println(s);
    }
}
