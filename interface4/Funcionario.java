package interface4;

public abstract class Funcionario {
    protected String nome;
    protected String dataNasc;
    protected double salario;
    protected Sexo sexo;
    protected Setor setor;

   // Construtor
   public Funcionario(String nome, String dataNasc, double salario, Sexo sexo, Setor setor) {
    this.nome = nome;
    this.dataNasc = dataNasc;
    this.salario = salario;
    this.sexo = sexo;
    this.setor = setor;
}

// Métodos getter e setter para cada atributo

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDataNasc() {
    return dataNasc;
}

public void setDataNasc(String dataNasc) {
    this.dataNasc = dataNasc;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

public Sexo getSexo() {
    return sexo;
}

public void setSexo(Sexo sexo) {
    this.sexo = sexo;
}

public Setor getSetor() {
    return setor;
}

public void setSetor(Setor setor) {
    this.setor = setor;
}

// Método abstrato para ser implementado pelas subclasses
public abstract double salarioFinal(double salario);


public String toString() {
    return "Nome: " + nome + 
           "\nData de Nascimento: " + dataNasc + 
           "\nSalário: R$ " + salario + 
           "\nSexo: " + sexo + 
           " \nSetor: " + setor;

}


}
    
