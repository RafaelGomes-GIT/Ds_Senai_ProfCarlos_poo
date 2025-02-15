package atvlivroveiculo;

class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capacidadeTanque;
    private double velocidadeMaxima;
    private double consumoMedio;

  
    public Veiculo(String placa, String cor, int numeroDePassageiros, double capacidadeTanque, 
                   double velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    
    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    
    public void exibirInformacoes() {
        System.out.println("Veículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Número de Passageiros: " + numeroDePassageiros);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + " litros");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo Médio: " + consumoMedio + " km/l");
        System.out.println();
    }
}
