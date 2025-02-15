package atvlivroveiculo;

public class Main {
    public static void main(String[] args) {
       
        Veiculo veiculo = new Veiculo("AAA-1114", "Preto", 5, 50.0, 180.0, 12.5);
        
       
        Livro livro = new Livro("O CACAU", "Paulo Coelho", "978-85-325-0003-5", 208, 39.90);
        
        
        veiculo.exibirInformacoes();
        livro.exibirInformacoes();
    }
}