package relacionamento3;

public class Funcionario {
    private String codigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Conta_bancaria contaBanco;
    
    

    public Funcionario(String codigoFuncionario, String nome, String endereco, String telefone, String email,
            Conta_bancaria contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }


    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }
    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Funcionario [codigoFuncionario=" + codigoFuncionario + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + ", email=" + email + ", contaBanco=" + contaBanco + "]";
    }

    

}

