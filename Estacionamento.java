public class Estacionamento{
    private Veiculo[] veiculos;
    private int quantidadeVeiculos;
    private int vagas;

    Estacionamento(int vagas){
        this.veiculos = new Veiculo[vagas];
        this.quantidadeVeiculos = 0;
        this.vagas = vagas;
    }

    public void adicionarVeiculo(Veiculo novoVeiculo){
        if(quantidadeVeiculos < vagas){
            veiculos[quantidadeVeiculos] = novoVeiculo;
            quantidadeVeiculos++;

        }

        else {
            System.out.println("Estacionamento cheio.");
        }
    }

    public double calcularFaturamentoTotal(){
        double faturamentoTotal = 0;

        for (int i = 0; i < quantidadeVeiculos; i++){
            faturamentoTotal += veiculos[i].calcularValorEstadia();
        }
        return faturamentoTotal;
    }
}