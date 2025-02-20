package relacionamento;

public class Clientee {
    private String nome;
    private int idade;
    private Endereco endereco;
   
   
   
   
    
    public Clientee(String nome, int idade, Endereco endereco ){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
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
        return "Clientee [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }
    
    
    
  
    
    

    
    
    }
    
    
    


   

    



