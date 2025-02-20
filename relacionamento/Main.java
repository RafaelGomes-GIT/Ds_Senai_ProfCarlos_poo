package relacionamento;

public class Main {
    public static void main(String[] args) {
        
    //versão 1
    Endereco endereco1 = new Endereco("RUA A", 23, "SALVADOR");
    Clientee cliente1 = new Clientee("marta", 33,  endereco1);

    System.out.println(cliente1.toString());
    
    //versão2

    Clientee cliente2 = new Clientee("marta", 33,   new Endereco("Rua A", 30, "riacho"));

        System.out.println(cliente2.toString());
}
    
}