package k05.exception;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * @see Exception for invalid input
 */
public class MissmatchInputException extends Exception {
    /**
     * @param message of Exception
     * @since K03
     */
    public MissmatchInputException(String message) {
        super(message);
    }

    /**
     * @param cause of Exception
     * @since K03
     */
    public MissmatchInputException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message of exception
     * @param err     of exception
     * @since K03
     */
    public MissmatchInputException(String message, Throwable err) {
        super(message, err);
    }
}
