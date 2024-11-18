package com.loiane.cursojava.aula20;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizM = new int[10][10];

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM.length; j++){
                matrizM[i][j] = random.nextInt(20);
                System.out.print(matrizM[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("===================================");
        int maiorDaLinha = 0;
        int menorDaLinha = 100;

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM.length; j++){
                if(i == 4 && matrizM[i][j] > maiorDaLinha){
                    maiorDaLinha = matrizM[i][j];
                } else if (i == 4 && matrizM[i][j] < menorDaLinha){
                    menorDaLinha = matrizM[i][j];
                }
            }
        }
        System.out.println("O maior valor da linha 5 é " + maiorDaLinha);
        System.out.println("O menor valor da linha 5 é " + menorDaLinha);
        System.out.println("===================================");

        int maiorDaColuna = 0;
        int menorDaColuna = 100;
        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM.length; j++){
                if(j == 6 && matrizM[i][j] > maiorDaColuna){
                    maiorDaColuna = matrizM[i][j];
                } else if (j == 6 && matrizM[i][j] < menorDaColuna){
                    menorDaColuna = matrizM[i][j];
                }
            }
        }
        System.out.println("O maior valor da coluna 7 é " + maiorDaColuna);
        System.out.println("O menor valor da coluna 7 é " + menorDaColuna);

    }
}
