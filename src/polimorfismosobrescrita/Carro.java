package polimorfismosobrescrita;

public class Carro extends Veiculo {

    @Override
    public void passageiroOuCarga() {

        System.out.println("Carro: passeio");
        super.passageiroOuCarga();
    }
    public Carro(String marca, String modelo,String cor, double kmAtual) {
        super(marca, modelo, cor,kmAtual);
    }

    public Carro(){

    }
}
