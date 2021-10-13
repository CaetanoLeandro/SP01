package interfacesabstract;

import publicprivateproteced.veiculo.Veiculo;

public class EntregaVeiculo extends Veiculo implements Imethods{

    String limpo, revisado;

    public EntregaVeiculo(String modelo, String cor) {
        super(modelo, cor);

    }

    public EntregaVeiculo() {

    }


    @Override
    public String revisar() {
        return "Revisado!";
    }

    @Override
    public String limpar() {
        return "Limpo!";
    }
}
