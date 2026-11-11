public class Caminhao extends Veiculo{
    private double taxaCarga;

    public Caminhao(){
        super();
        this.taxaCarga = 0.0;
    }

    public Caminhao(String placa, String modelo, int horasEstacionado, Double valorHora, double taxaCarga){
        super(placa, modelo, horasEstacionado, valorHora);
        this.taxaCarga = taxaCarga;
    }

    public double getTaxaCarga(){
        return taxaCarga;
    }

    public void setTaxaCarga(double novoTaxaCarga){
        this.taxaCarga = novoTaxaCarga;
    }

    @Override

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Taxa da carga: " + taxaCarga);
    }

    @Override

    public double calcularValorEstadia(){
        return (horasEstacionado * valorHora) + taxaCarga;
    }

}