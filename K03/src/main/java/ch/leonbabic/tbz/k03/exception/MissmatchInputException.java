package ch.leonbabic.tbz.k03.exception;

public class MissmatchInputException extends Exception {
    public MissmatchInputException(String message) {
        super(message);
    }

    public MissmatchInputException(Throwable cause) {
        super(cause);
    }

    public MissmatchInputException(String message, Throwable err) {
        super(message, err);
    }
}
