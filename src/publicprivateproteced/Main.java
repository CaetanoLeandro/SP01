package publicprivateproteced;

import publicprivateproteced.veiculo.Moto;
import publicprivateproteced.veiculo.Veiculo;

public class Main {


    public static void main(String[] args) {



        Veiculo carro = new Veiculo();
        carro.modelo = "Fiat";

        Moto moto = new Moto();
        moto.modelo = "Honda";




        System.out.println("Modelo: " + carro.modelo ); //public
        //System.out.println("Km atual (variavel direto): " + carro.exibirKM()); //private double
        System.out.println("Km atual(método): " + carro.getKmAtual());
        System.out.println("Cor do carro: " + carro.getCor());

        System.out.println(" ");

        System.out.println("Modelo: " + moto.modelo );

        System.out.println("Cor da Moto: " + moto.getCor2());




    }
}
