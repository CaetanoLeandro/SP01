package aplfinestc;


public class Carro extends Veiculo{

    Boolean getLast = getUltimaUnidade();


    @Override
    public String getMarcaModelo() {
        return super.getMarcaModelo();
    }

    @Override
    public void setMarcaModelo(String marcaModelo) {
        super.setMarcaModelo(marcaModelo);
    }

    @Override
    public Boolean getUltimaUnidade() {

            return super.getUltimaUnidade();

    }


    public Carro() {
    }

    @Override
    public  String toString(){

        return "Modelo escolhido: " + getMarcaModelo() + "\nTem em estoque?: "+ this.getLast +
                "\nModelo de rodas: " + this.rodas;


    }


}
