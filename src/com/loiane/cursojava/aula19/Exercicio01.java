package com.loiane.cursojava.aula19;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor1 = new int[]{1, 2, 3, 4, 5};
        int[] vetor2 = new int[vetor1.length];

        for(int i = 0; i < vetor1.length; i++){
            vetor2[i] = vetor1[i];
            System.out.print(vetor2[i] + "/ ");
        }
    }
}
