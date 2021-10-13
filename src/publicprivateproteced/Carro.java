package publicprivateproteced;


import publicprivateproteced.veiculo.Veiculo;

public class Carro extends Veiculo {

     String cor1;



     {
         cor1 = cor;
     }

    public Carro(String cor1) {
        this.cor1 = cor1;
    }

    public Carro(String modelo, String cor, String cor1) {
        super(modelo, cor);
        this.cor1 = cor1;
    }
}

