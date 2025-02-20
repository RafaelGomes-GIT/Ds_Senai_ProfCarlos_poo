package relacionamentoEnum2;

public class Funcionarioo {
    
    private String id;
    private String nome;
    private String salario;
    private String idade;
    private Setor setor;
    private Sexo sexo;
    private Estado estado;
    

    
    public Funcionarioo(String id, String nome, String salario, String idade, Setor setor, Sexo sexo, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.setor = setor;
        this.sexo = sexo;
        this.estado = estado;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Funcionarioo [id=" + id + ", nome=" + nome + ", salario=" + salario + ", idade=" + idade + ", setor="
                + setor + ", sexo=" + sexo + ", estado=" + estado + "]";
    }
    
   
    
    

}
