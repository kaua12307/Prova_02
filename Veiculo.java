public class Veiculo{
    protected String placa;
    protected String modelo;
    protected int horasEstacionado;
    protected  double valorHora;

    public Veiculo(){
        this.placa = "Indefinido";
        this.modelo = "Indefinido";
        this.horasEstacionado = 0;
        this.valorHora = 0.0;
    }

    public Veiculo(String placa, String modelo, int horasEstacionado, double valorHora){
        this.placa = placa;
        this.modelo = modelo;
        this.horasEstacionado = horasEstacionado;
        this.valorHora = valorHora;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getHorasEstacionado(){
        return this.horasEstacionado;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    public void setModelo(String novomModelo){
        this.modelo = novomModelo;
    }

    public void setHorasEstacionado(int novoHorasEstacionado){
        this.horasEstacionado = novoHorasEstacionado;
    }

    public void setValorHora(double novoValorHora){
        this.valorHora = novoValorHora;
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Horas estacionado: " + this.horasEstacionado);
        System.out.println("Valor da hora: " + this.valorHora);
    }

    public double calcularValorEstadia(){
        return (double) horasEstacionado * valorHora;
    }
}