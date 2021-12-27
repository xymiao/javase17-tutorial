public class CustRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            test("1");
            test("2");
            //test(null);
        }catch(CustRuntimeException ex){
            System.out.println("异常信息：" + ex.getMessage());
        }
    }

    static void test(String type){
        if(type == null){
            throw new CustRuntimeException("参数 Type 不能为空！");
        }

        if(type.equals("1")){
            System.out.println("加载类型为 1 的测试数据！");
        }else{
            throw new CustRuntimeException("找不到参数 Type 应该为 1，却是：" + type);
        }
    }
    
}

