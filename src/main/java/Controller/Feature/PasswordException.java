package Controller.Feature;

public class PasswordException extends Exception{
    public PasswordException(String passStatus) {
        super(passStatus);
    }
}
