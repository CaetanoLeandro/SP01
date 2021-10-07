package polimorfismosobrescrita;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private double kmAtual = 0.0;

    public void passageiroOuCarga(){
    }

    public Veiculo(String marca, String modelo,String cor, double kmAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kmAtual = kmAtual;
    }

    public Veiculo(){

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(double kmAtual) {
        this.kmAtual = kmAtual;
    }
}
