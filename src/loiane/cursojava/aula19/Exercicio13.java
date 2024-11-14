package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(50);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("*********************************************************");
        int somaVetor = 0;

        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 5 == 0){
                somaVetor += vetorA[i];
            }
        }
        System.out.println("A soma dos valore multiplos de 5 no vetor é= " + somaVetor);
    }
}
