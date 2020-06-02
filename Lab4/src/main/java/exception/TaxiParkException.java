package exception;

public class TaxiParkException extends Exception {
    public TaxiParkException(String message) {
        super(message);
    }

    public TaxiParkException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaxiParkException(Throwable cause) {
        super(cause);
    }

    protected TaxiParkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
