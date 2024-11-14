package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio12 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] elementos = new int[10];

        for (int i = 0; i < elementos.length; i++){
            elementos[i] = random.nextInt(50);
        }

        int somaVetor = 0;
        for (int i = 0; i < elementos.length; i++){
            System.out.print(elementos[i] + "/ ");
            somaVetor += elementos[i];
        }
        System.out.println();
        System.out.println("A soma dos valores dentro do vetor é = " + somaVetor);

    }
}
