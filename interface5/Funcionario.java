package interface5;

import java.time.LocalDate;

public abstract class Funcionario implements SalarioFinal {
     protected String nome, cpf, rg;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataNascimento, dataAdmissao;
    
    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }
    
    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
    
    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario Final: " + getSalarioFinal();
    }
}

