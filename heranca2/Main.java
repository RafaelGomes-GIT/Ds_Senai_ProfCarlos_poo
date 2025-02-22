package heranca2;

public class Main {
    public static void main(String[] args) {
        
        Processador processador1 = new Processador("Ryzen", "Ryzen 7 5500x3d", "4.1ghz");
        Memoria memoria1 = new Memoria("Asgard", "DDR4", "16GB");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
