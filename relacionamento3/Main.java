package relacionamento3;

public class Main {
        public static void main(String[] args) {
            
            Conta_bancaria conta1 = new Conta_bancaria("Bradesco","3571", "1000378", "50.000", "100.000");
            Funcionario funcionario1 = new Funcionario("12345", "Osvaldinho", "Largo do bonfim", "111-111","osvaldo@gmail", conta1);
       
            System.out.println(conta1.toString());
        }
}
