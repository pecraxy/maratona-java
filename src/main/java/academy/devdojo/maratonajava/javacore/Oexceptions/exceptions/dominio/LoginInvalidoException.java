package academy.devdojo.maratonajava.javacore.Oexceptions.exceptions.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
