package publicprivateproteced.veiculo;

public class Veiculo {


        String marca;
        public String modelo;
        protected String cor = "Vermelho";
        private double kmAtual = 47.000;


        /*public double exibirKM(){
           return kmAtual = 55.000;
        }*/

        public Veiculo(){
            this.marca = marca;
            this.cor = cor;
            this.kmAtual = kmAtual;
        }

        public Veiculo(String modelo, String cor){

        }
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
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

    public String getModelo() {
        return modelo;
    }

    public String getCor2() {
        return getCor2();
    }
}


