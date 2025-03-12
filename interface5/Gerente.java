package interface5;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
    }
}

