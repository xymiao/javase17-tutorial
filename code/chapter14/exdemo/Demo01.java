public class Demo01 {
    public static void main(String[] args) {
        try{
            Demo01 demo01 = new Demo01();
            demo01.test("");
        }catch(ParamException ex){
            System.out.println("出现异常：" + ex.getMessage());
        }
    }

    void test(String s) throws ParamException{
        if (s == null || "".equals(s)) {
            throw new ParamException("参数错误，请验证您的参数是否正确！");
        }
        System.out.println(s);
    }

}
