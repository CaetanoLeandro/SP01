package br.com.sprint01.interfacesabstract;

public abstract  class Veiculo {

    private String modelo = "Porsche 911";
    private String cor = "Amarelo";



    public Veiculo(String modelo, String cor){

        this.modelo = modelo;
        this.cor = cor;

    }

    public Veiculo() {

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

}
