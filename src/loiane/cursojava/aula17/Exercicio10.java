package loiane.cursojava.aula17;

import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[2];
        vetor[0] = 0;
        vetor[1] = 1;
        do {
            vetor[0] = random.nextInt(100);
            vetor[1] = random.nextInt(100);
            if(vetor[0] < vetor[1]) {
                System.out.println("vetor posição 0: " + vetor[0]);
                System.out.println("vetor posição 1: " + vetor[1]);
            }
        } while (vetor[0] > vetor [1]);

        for(int i = vetor[0]; i <= vetor[1]; i++ ){
            System.out.println(i);
        }

    }
}
