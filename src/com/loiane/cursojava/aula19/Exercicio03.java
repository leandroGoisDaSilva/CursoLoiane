package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição " + (1 + i) + ": ");
            vetorA[i] = random.nextInt(20);
            System.out.println(vetorA[i]);
        }
        System.out.println("************************************");

        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Resultado da posição " + (1+i) + ": " + vetorB[i]);
        }
    }
}
