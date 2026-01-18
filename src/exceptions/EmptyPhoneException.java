package exceptions;

public class EmptyPhoneException extends RuntimeException {
  public EmptyPhoneException(String message) {
    super(message);
  }
}
