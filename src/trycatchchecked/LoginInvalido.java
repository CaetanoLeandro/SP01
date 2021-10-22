package trycatchchecked;

public class LoginInvalido extends Exception{

    public LoginInvalido() {
        super("Login Inválido");
    }

    public LoginInvalido(String message) {
        super(message);
    }
}
