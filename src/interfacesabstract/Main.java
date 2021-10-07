package interfacesabstract;

import static java.lang.System.*;

public class Main {



    public static void main(String[] args) {



       EntregaVeiculo carro = new EntregaVeiculo();




        out.println("Modelo: " + carro.getModelo());
        out.println("Cor do carro: " + carro.getCor());
        out.println("O veículo está: " + carro.revisar() + " e " + carro.limpar());



    }

}
