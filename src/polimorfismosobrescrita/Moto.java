package polimorfismosobrescrita;

public class Moto extends Veiculo {


    @Override
    public void passageiroOuCarga() {

        System.out.println("Moto: Passageiro e carga");
        super.passageiroOuCarga();
    }

    public Moto(String marca, String modelo,String cor, double kmAtual) {
        super(marca, modelo, cor,kmAtual);
    }
    public Moto(){

    }
}
