package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio17 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] idade = new int[10];
        int pessoasAcimaDe35Anos = 0;

        for (int i = 0; i < idade.length; i++){
            idade[i] = random.nextInt(70);
            System.out.print(idade[i] + "/ ");
            if(idade[i] > 35){
                pessoasAcimaDe35Anos++;
            }

        }
        System.out.println();
        System.out.println("O Grupo possui " + pessoasAcimaDe35Anos + " pessoas acima de 35 anos!");
    }
}
