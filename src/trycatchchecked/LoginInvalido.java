package trycatchchecked;

public class LoginInvalido extends RuntimeException{

    public LoginInvalido() {
        super("Login Inválido");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
