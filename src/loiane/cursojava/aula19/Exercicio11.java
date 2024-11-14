package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio11 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + "/ ");
        }
        System.out.println();
        System.out.println("*****************************");
        int qtdElementos = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                qtdElementos++;
            }
        }
        System.out.println("Quantidade de números pares no vetor é: " + qtdElementos);
    }
}
