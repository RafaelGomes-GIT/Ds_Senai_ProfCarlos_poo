package atividade_pet;
import java.util.Scanner;



import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Random rand = new Random();
        Pet[] pet  = new Pet [2];  

        int cont = 1;


        for (int i = 0; i < pet.length; i++) {
            pet[i] = new Pet();  

            System.out.println("Digite o Nome do " + cont + " Pet:");
            pet[i].setNome(in.nextLine());

            System.out.println("Digite a Raça do pet " + pet[i].getNome());
            pet[i].setRaca(in.nextLine());

            int numeroAleatorio = rand.nextInt() + 20;
            pet[i].setIdade(numeroAleatorio);  
            System.out.println("Idade do " + pet[i].getNome() + " : " + numeroAleatorio);


            System.out.println("Digite o Porte do pet " + pet[i].getNome());
            pet[i].setPorte(in.nextLine());

            System.out.println("Digite a Alimentação do pet " + pet[i].getNome());
            pet[i].setAlimentacao(in.nextLine());
            

            cont++;
        }

        
        for (int i = 0; i < pet.length; i++) {
            System.out.println("Nome: " + pet[i].getNome());
            System.out.println("Idade: " + pet[i].getIdade());
            System.out.println("Raça: " + pet[i].getRaca());
            System.out.println("Porte: " + pet[i].getPorte());
            System.out.println("Alimentação: " + pet[i].getAlimentacao());
        }

        in.close();








    }
}
