package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(20);
            System.out.println("vetorA posição " + i + ": " + vetorA[i]);
            vetorB[i] = random.nextInt(20);
            System.out.println("vetorB posição " + i + ": " + vetorB[i]);
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println("vetorC na posição" + i + " é: " + vetorA[i] + " X " + vetorB[i] + " = " + vetorC[i]);
            System.out.println("*****************************************************************");
        }

    }
}
