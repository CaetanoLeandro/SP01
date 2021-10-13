package publicprivateproteced.veiculo;


   public class Moto extends Veiculo{


      public Veiculo veiculo;


      public String cor2 = this.getCor(); // ex.  por Referência


      public Moto(Veiculo veiculo, String cor2) {
         this.veiculo = veiculo;
         this.cor2 = cor2;
      }

      public Moto(String modelo, String cor, Veiculo veiculo, String cor2) {
         super(modelo, cor);
         this.veiculo = veiculo;
         this.cor2 = cor2;
      }

       public Moto() {

       }
   }
