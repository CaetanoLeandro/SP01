package trycatch;

public class Main {

    public static void main(String[] args) {


         double valorVeiculo = 700000.00;
         double entrada = 10000.00;
         int numeroParcelas = 30;


        try {
            Finaciamento f = new Finaciamento(valorVeiculo, entrada, numeroParcelas);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException ex ){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Procedimento finalizado");
        }


    }

}
