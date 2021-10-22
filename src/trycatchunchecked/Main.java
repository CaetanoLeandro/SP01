package trycatchunchecked;

public class Main {

    public static void main(String[] args) {


         double valorVeiculo = 200000.00;
         double entrada = 20000.00;
         int numeroParcelas = 50;


        try {
            Finaciamento f = new Finaciamento(valorVeiculo, entrada, numeroParcelas);
            System.out.println(f.prestacao());
        }
        catch (Verificadados ex ){
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("Procedimento finalizado");
        }


    }

}
