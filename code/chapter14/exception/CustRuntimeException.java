public class CustRuntimeException extends RuntimeException{

    public CustRuntimeException() {
        System.out.println("运行时异常");
    }

    public CustRuntimeException(String message) {
        super(message);
    }

    public CustRuntimeException(Throwable cause) {
        super(cause);
    }

    public CustRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustRuntimeException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
