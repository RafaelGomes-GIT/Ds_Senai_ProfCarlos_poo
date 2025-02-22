package heranca1;
// abstract: Não é instanciada, mas serve como modelo para as classes que herdão ela.
//protected: apenas classes que extendem da superclass pode utilizar o super nos construtores
public abstract class Pessoa {
    protected String nome;
    protected int idade;
   
   
   
   
    public Pessoa() {
    }

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    

}
