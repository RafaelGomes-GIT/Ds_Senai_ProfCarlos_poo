package relacionamento2;

public class Pet {
    private String nome;
    private String idade;
    private String Raca;
    
    public Pet(String nome, String idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        Raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    @Override
    public String toString() {
        return "Pet [nome=" + nome + ", idade=" + idade + ", Raca=" + Raca + "]";
    }

    
    
}
