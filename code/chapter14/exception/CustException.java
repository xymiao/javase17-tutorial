public class CustException extends Exception {

    public CustException() {
    }

    public CustException(String message) {
        super(message);
    }

    public CustException(Throwable cause) {
        super(cause);
    }

    public CustException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
