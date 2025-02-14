package atividade_livro;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        Random rand = new Random();
        Livro[] livro1 = new Livro[2];  

        int cont = 1;

        for (int i = 0; i < livro1.length; i++) {
            livro1[i] = new Livro();  

            System.out.println("Digite o Titulo do livro " + cont);
            livro1[i].setTitulo(in.nextLine());

            System.out.println("Digite o autor do livro " + livro1[i].getTitulo());
            livro1[i].setAutor(in.nextLine());

            int numeroAleatorio = rand.nextInt(301) + 100;
            livro1[i].setNumPag(numeroAleatorio);  
            System.out.println("Número de páginas do livro " + livro1[i].getTitulo() + " : " + numeroAleatorio);

            double numeroDecimal = rand.nextDouble() * 100;  
            livro1[i].setPreco(numeroDecimal);  
            System.out.println("Preço do livro " + livro1[i].getTitulo() + " : " + numeroDecimal);

            cont++;
        }

        
        for (int i = 0; i < livro1.length; i++) {
            System.out.println("TITULO: " + livro1[i].getTitulo());
            System.out.println("AUTOR: " + livro1[i].getAutor());
            System.out.println("Número de Páginas: " + livro1[i].getNumPag());
            System.out.println("Preço: " + livro1[i].getPreco());
        }

        in.close();
    }
}