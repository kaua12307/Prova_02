public class Moto extends Veiculo{
    private double percentualDeDesconto;

    public Moto(){
        super();
        this.percentualDeDesconto = 0.0;
    }

    public Moto(String placa, String modelo, int horasEstacionado, double valorHora, double percentualDeDesconto){
        super(placa, modelo, horasEstacionado, valorHora);
        this.percentualDeDesconto = percentualDeDesconto;
    }

    public double getPercentualDeDesconto(){
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(double novoPercentualDeDesconto){
        this.percentualDeDesconto = novoPercentualDeDesconto;
    }


    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Desconto: " + percentualDeDesconto + "%");

    }

    @Override 
    public double calcularValorEstadia(){
        return (horasEstacionado * valorHora) - ((horasEstacionado * valorHora) * (percentualDeDesconto / 100));
    }
}