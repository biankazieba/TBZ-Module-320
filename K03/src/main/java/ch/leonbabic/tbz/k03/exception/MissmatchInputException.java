package ch.leonbabic.tbz.k03.exception;

/**
 * @see java.lang.Exception for invalid input
 */
public class MissmatchInputException extends Exception {
    /**
     * @param message of Exception
     */
    public MissmatchInputException(String message) {
        super(message);
    }

    /**
     * @param cause of Exception
     */
    public MissmatchInputException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message of exception
     * @param err     of exception
     */
    public MissmatchInputException(String message, Throwable err) {
        super(message, err);
    }
}
