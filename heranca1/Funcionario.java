package heranca1;

public class Funcionario extends Pessoa  {
    private String salario;
    private String matricula;
    private String cargo;


    public Funcionario() {
    }

    
    public Funcionario(String nome, int idade, String salario, String matricula, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
        this.cargo = cargo;
    }


    public String getSalario() {
        return salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCargo() {
        return cargo;
    }


    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", idade=" + idade + ", matricula=" + matricula
                + ", cargo=" + cargo + "]";
    }


}
