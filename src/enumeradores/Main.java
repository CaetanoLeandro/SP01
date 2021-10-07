package enumeradores;

public class Main {


    public static void main(String[] args) {

       for (MesesDoAno m : MesesDoAno.values()){

           System.out.println( m + ": " +m.meses);

       }
    }


}
