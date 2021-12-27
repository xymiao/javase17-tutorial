public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Class.forName("ExceptionTest2");
        } catch (ClassNotFoundException ex) {
            System.err.println("异常信息：" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
