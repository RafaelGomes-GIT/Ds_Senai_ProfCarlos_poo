package relacionamento2;

public class Main {
    public static void main(String[] args) {
       Cliente  cliente3 = new Cliente("Osvaldo", "40", new Pet("Osvaldinho", "40", "galinha"));
        
       System.out.println(cliente3.toString());

    }
}
