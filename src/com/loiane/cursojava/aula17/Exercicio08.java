package com.loiane.cursojava.aula17;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] valoresAleatorios = new int[5];
        int soma = 0;
        double media;

        for (int i = 0; i < valoresAleatorios.length; i++){
            valoresAleatorios[i] = random.nextInt(100);
            soma += valoresAleatorios[i];
            System.out.println(valoresAleatorios[i]);
        }

        System.out.println("********************************");
        System.out.println("A soma dos valores é igual a " + soma);
        media = soma / valoresAleatorios.length;
        System.out.println("A média dos valores é igual a " + media);

    }
}
