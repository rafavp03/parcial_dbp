package dbp.parcial.exceptions;

public class AlreadyRequestedException extends RuntimeException {
    public AlreadyRequestedException(String message) {
        super(message);
    }
}
