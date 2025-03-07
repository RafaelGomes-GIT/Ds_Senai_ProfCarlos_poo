public class Main {
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor("Lucas", "12/08/1975", 10000.00, Sexo.MASCULINO, Setor.TI);
        Motoboy motoboy = new Motoboy("Carlos","10/07/1980", 2500.00,Sexo.MASCULINO, Setor.TI, "ABC123" );

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());

    }
}
