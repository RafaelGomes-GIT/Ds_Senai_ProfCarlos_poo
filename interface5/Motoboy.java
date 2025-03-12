package interface5;

import java.time.LocalDate;

public class Motoboy extends Funcionario {

    private String placaDaMoto;
    public Motoboy(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Placa da Moto: " + placaDaMoto;
    }
}
