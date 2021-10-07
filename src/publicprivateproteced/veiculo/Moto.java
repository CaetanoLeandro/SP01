package publicprivateproteced.veiculo;


   public class Moto extends Veiculo{


      public Veiculo veiculo;


      public String cor2 = this.getCor(); // ex.  por Referência



      public Moto(){

      }

      public void setVeiculo(Veiculo veiculo) {
         this.veiculo = veiculo;
      }

      public String getCor2() {
         return cor2;
      }


   }
