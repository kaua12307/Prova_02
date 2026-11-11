public class Aplicacao{
    public static void main(String[] args){
        Estacionamento e1 = new Estacionamento(5);
        Veiculo[] veiculos = new Veiculo[5];

        Veiculo v1 = new Moto("ADR1562", "Honda", 5, 10.0, 10.0);
        Veiculo v2 = new Caminhao("JHV1763", "Scania", 20, 50.0, 100.0);
        Veiculo v3 = new Veiculo("SGF0982", "Toyota", 8, 20.0);
        Veiculo v4 = new Veiculo();

        veiculos[0] = v1;
        veiculos[1] = v2;
        veiculos[2] = v3;
        veiculos[3] = v4;

        e1.adicionarVeiculo(v1);
        e1.adicionarVeiculo(v2);
        e1.adicionarVeiculo(v3);
        e1.adicionarVeiculo(v4);

        System.out.println("Faturamento Total: " + e1.calcularFaturamentoTotal());

        System.out.println("");

        for (int i = 0; i < 4; i++){
            System.out.println("Valor da estadia do veiculo na posição " + i + ": " + veiculos[i].calcularValorEstadia());
        }




    }

}