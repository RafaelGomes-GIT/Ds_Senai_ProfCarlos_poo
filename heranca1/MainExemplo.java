package heranca1;

public class MainExemplo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", 20, "20 de fevereiro", "pix");
        Funcionario funcionario1 = new Funcionario("Marta", 20, "2.000", "12345", "Gerente");

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());

    }
}
