package trycatchchecked;

import java.text.ParseException;
import java.util.Scanner;

public class LoginExeception {

    public static void main(String[] args) {

        try {
            login();
        } catch (LoginInvalido e){
            e.printStackTrace();// Mostra a sequencia de métodos, que acarretou na exception
        }finally { //
            System.out.println("Procedimento finalizado");
        }
    }
    public static void login() throws LoginInvalido {// Checked necessário sinalizar pro método,
        // para que complile (usando o throw)
        Scanner sc = new Scanner(System.in);
        String userName = "Leandro";
        String senha = "123";
        int senha2 = Integer.parseInt(senha);
        System.out.println("Usuário");
        String userNameDig = sc.nextLine();
        System.out.println("Senha");
        String senhaDig = sc.nextLine();

        if (userName.equals(userNameDig) || senha.equals(senhaDig)) {
            System.out.println("Logado com sucesso!");
        }
          else {
              throw new LoginInvalido("Usuário ou senha invalido");
        }
    }
}
