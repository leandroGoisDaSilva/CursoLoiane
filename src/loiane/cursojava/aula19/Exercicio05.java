package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = random.nextInt(50);
            vetorB[i] = vetorA[i];
            System.out.println(vetorA[i]);
        }
        System.out.println("************************************");

        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * i;
            System.out.println("Resultado da posição " + i + ": " + vetorB[i]);
        }
    }
}
