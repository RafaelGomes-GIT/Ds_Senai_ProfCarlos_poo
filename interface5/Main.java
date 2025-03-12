package interface5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario motoboy = new Motoboy("Carlos", "123.456.789-00", "MG-12.345.678", Genero.MASCULINO, 2000.0, LocalDate.of(1990, 5, 20), LocalDate.of(2020, 1, 10), "ABC-1234");
        Funcionario gerente = new Gerente("Ana", "987.654.321-00", "SP-98.765.432", Genero.FEMININO, 5000.0, LocalDate.of(1985, 3, 15), LocalDate.of(2018, 6, 5));
        Diretor diretor = new Diretor("Roberto", "111.222.333-44", "RJ-11.223.344", Genero.MASCULINO, 8000.0, LocalDate.of(1975, 7, 10), LocalDate.of(2015, 9, 20));

        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);

        diretor.admitir(motoboy);
        diretor.demitir(gerente);
    }
}
