package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM.length; j++){
                System.out.print("Digite o valor da Linha "+ (i+1) + " Coluna " + (j+1) + ": ");
                matrizM[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM.length; j++){
                System.out.print(matrizM[i][j] + " | ");
            }
            System.out.println();
        }

        int quantidadePar = 0;
        int quantidadeImpar = 0;

        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM.length; j++){
                if(matrizM[i][j] % 2 == 0){
                    quantidadePar++;
                } else {
                    quantidadeImpar++;
                }
            }
        }
        System.out.println();
        System.out.println("A matriz possui " + quantidadePar + " número(s) pares");
        System.out.println("A matriz possui " + quantidadeImpar + " número(s) impares");

    }
}
