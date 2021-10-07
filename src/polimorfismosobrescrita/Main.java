package polimorfismosobrescrita;

public class Main {

    public static void main(String[] args) {


        Cliente pessoa = new Cliente();

        Veiculo carro = new Carro();
        carro.passageiroOuCarga();

        Veiculo caminhao = new Caminhao();
        caminhao.passageiroOuCarga();

        Veiculo moto = new Moto();
        moto.passageiroOuCarga();


        System.out.println("Nome do Cliente:");
        System.out.println(pessoa.cadastra("João", "Paulo", "Alves"));





    }
}
