package exceptions;

public class EmptyEmailException extends RuntimeException {
    public EmptyEmailException(String message) {
        super(message);
    }
}
