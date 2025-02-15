package atividade_cliente_veiculo;

public class Main {
        public static void main(String[] args) {
            
            Veiculo veiculo = new Veiculo("AAA-1114", "Preto", 5, 50.0, 180.0, 12.5);
            Cliente cliente = new Cliente("AAA-1114", 20, "53232322", "Largo do bonfim", "3232-3232");


            System.out.println("");
            veiculo.exibirInformacoes();
            cliente.exibirInformacoes();
        }
}
