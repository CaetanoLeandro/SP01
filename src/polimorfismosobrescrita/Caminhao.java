package polimorfismosobrescrita;

public class Caminhao extends Veiculo {

    @Override
    public void passageiroOuCarga() {

        System.out.println("Caminhão: carga");
        super.passageiroOuCarga();
    }

    public Caminhao(String marca, String modelo,String cor, double kmAtual) {
        super(marca, modelo, cor,kmAtual);
    }

    public Caminhao(){

    }
}
