package com.loiane.cursojava.aula17;

import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] valoresAleatorios = new int[5];
        Random random = new Random();
        int num;
        int valorMaior = 0;

        for (int i = 0; i < valoresAleatorios.length; i++){
            valoresAleatorios[i] = random.nextInt(100);
            num = valoresAleatorios[i];
            System.out.println(num);

            if(num > valorMaior){
                valorMaior = num;
            }

        }
        System.out.println("********************************");
        System.out.println("O maior valor é: " + valorMaior);

    }
}
