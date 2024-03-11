package exceptions;

public class LowCGPAException extends Exception {
    public LowCGPAException() {
        super("CGPA cannot be lower than 2.50.");
    }
}
