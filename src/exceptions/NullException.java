package exceptions;

public class NullException extends Exception {
    public NullException() {
        super("Empty Field not allowed.");
    }
}
