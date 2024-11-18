package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio16 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[20];
        int somaMenorQue15 = 0;
        int quantidadeElementos = 0;
        int somaElementos = 0;
        int quantidadeElementosMaior15 = 0;
        double media = 0;

        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(30);
            System.out.print(vetorA[i] + "/ ");
        }
        System.out.println();
        for(int i = 0; i < vetorA.length; i++){
                if(vetorA[i] < 15){
                somaMenorQue15 += vetorA[i];

                } else if(vetorA[i] == 15){
                    quantidadeElementos++;

                } else if (vetorA[i] > 15){
                    somaElementos += vetorA[i];
                    quantidadeElementosMaior15++;
                }

        }

        System.out.println("Soma dos elementos inferiores a 15: " + somaMenorQue15);
        System.out.println("Quantidade de elementos que são iguais a 15: " + quantidadeElementos);
        System.out.println("Média dos elementos que são maiores que 15: " + (somaElementos / quantidadeElementosMaior15));

    }
}
