package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio18 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] idade = new int[10];
        int maiorIdade = 0;
        int menorIdade = 100;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 0; i < idade.length; i++){
            idade[i] = random.nextInt(70);
            System.out.print(idade[i] + "/ ");
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
                posicaoMaior = i;

            } else if (idade[i] < menorIdade){
                menorIdade = idade[i];
                posicaoMenor = i;
            }
        }
        System.out.println();
        System.out.println("A maior idade é " + maiorIdade + " e está na posição " + posicaoMaior +
                " do vetor de idade");
        System.out.println("A menor idade é " + menorIdade + " e está na posição " + posicaoMenor +
                " do vetor de idade");
    }
}
