package interface3;

public class Main {
    public static void main(String[] args) {
        
     Adicao adicao = new Adicao();
     Subtracao subtracao = new Subtracao();
     Multiplicacao multi = new Multiplicacao();
     Divisao div = new Divisao();


        System.out.println(adicao.cacular(10, 10));
        System.out.println(subtracao.cacular(10, 20));
        System.out.println(multi.cacular(10, 10));
        System.out.println(div.cacular(10, 5));

}


}