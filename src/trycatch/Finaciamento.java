package trycatch;

public class Finaciamento {

    public Double valorVeiculo;
    public Double entrada;
    public Integer numeroParcelas;

    public Finaciamento(Double valorVeiculo, Double entrada, Integer numeroParcelas) {

        if (entrada <= valorVeiculo * 0.3) {
            throw new RuntimeException("A entrada deve ser no mínimo 30% do valor total");
        } else if (numeroParcelas < 30) {
            throw new RuntimeException("O número mínimo de parcelas deve ser 30");
        }

        this.valorVeiculo = valorVeiculo;
        this.entrada = entrada;
        this.numeroParcelas = numeroParcelas;
    }

    public double prestacao(){
        return (valorVeiculo - entrada)/numeroParcelas;
    }
}
