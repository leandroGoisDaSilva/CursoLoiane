package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(50);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("*********************************************************");


        double cont = 0.0;
        double somaImpar = 0.0;
        Double media;

        System.out.println("=====Números ímpares=====");
        for (int i = 0; i < vetorA.length; i++){
            if(!(vetorA[i] % 2 == 0)){
                System.out.print(vetorA[i] + "/ ");
                somaImpar += vetorA[i];
                cont++;
            }
        }
        System.out.println();
        media = somaImpar / cont;
        System.out.print("A média aritmética dos valores ímpares do vetor é = " + media);
    }
}
