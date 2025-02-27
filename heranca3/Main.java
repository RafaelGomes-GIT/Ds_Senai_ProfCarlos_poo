package heranca3;

public class Main {
        public static void main(String[] args) {
            Processador processador1 = new Processador("Ryzen", "7500x3D", "10", "4.1HZ", Produto.FABRICA);
            PlacaMae placamae1 = new PlacaMae("Asus", "B750M", "15", "AM5");
            Memoria memoria1 = new Memoria("Kingston", "RAM", "32gb", "4200");
            DispArmazenamento dispArm1 = new DispArmazenamento("Kingston", "SSD", "1T", "SSD");

            System.out.println(processador1.toString());
            System.out.println(placamae1.toString());
            System.out.println(memoria1.toString());
            System.out.println(dispArm1.toString());

            

        }
}
