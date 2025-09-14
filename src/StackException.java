/**
 * Исключение, которое нужно выбрасывать в некоторых ситуациях
 * при реализации методов стека
 */
public class StackException extends Exception {
    public StackException() {
        super();
    }

    public StackException(String message) {
        super(message);
    }

    public StackException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackException(Throwable cause) {
        super(cause);
    }

    protected StackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
