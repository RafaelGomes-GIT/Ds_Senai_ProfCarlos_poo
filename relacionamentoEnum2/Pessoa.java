package relacionamentoEnum2;

public class Pessoa {
    public static void main(String[] args) {
        
        Funcionarioo funcionario = new Funcionarioo("123456", "Rafael", "2.000", "20", Setor.FINANCEIRO, Sexo.MASCULINO, Estado.BAHIA);
        System.out.println(funcionario.toString());
}

}