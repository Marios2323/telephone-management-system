package exceptions;

public class EmptyContactListException extends RuntimeException {
    public EmptyContactListException(String message) {
        super(message);
    }
}
