package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição " + (1 + i) + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * 2;
            System.out.println("Resultado da posição 1: " + vetorB[i]);
        }
    }
}
