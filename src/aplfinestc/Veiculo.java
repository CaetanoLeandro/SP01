package aplfinestc;

public abstract class Veiculo {

    private String marcaModelo = "Ford Bronco";
    private final Boolean ultimaUnidade = true;
    protected static String rodas = "Liga Leve 17"; // Global não necessita de gatter e setter

    public Veiculo(){

    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public Boolean getUltimaUnidade() {
        return ultimaUnidade;
    }

    public static String getRodas() {
        return rodas;
    }

    public static void setRodas(String rodas) {
        Veiculo.rodas = rodas;
    }
}


