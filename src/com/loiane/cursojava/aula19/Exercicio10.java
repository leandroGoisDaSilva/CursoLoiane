package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetorA = new int[10];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = random.nextInt(50);
            System.out.println(vetorA[i]);
            vetorB[i] = vetorA[i] % 2;
            System.out.println("Resultado da posição " + i + " do vetorB é: " + vetorB[i]);
            System.out.println("************************************");
        }

    }
}
