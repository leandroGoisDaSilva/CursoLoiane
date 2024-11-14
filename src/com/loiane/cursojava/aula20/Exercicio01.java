package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] numerosAleatorios = new int[4][4];

        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios.length; j++){
                numerosAleatorios[i][j] = random.nextInt(100);
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios.length; j++){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Maior Linha = " + linha);
        System.out.println("Maior Coluna = " + coluna);
    }

}
