package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 - 10: ");
        int num = scan.nextInt();

        for(int i = 0; i <= 10; i++){
            int multiplicacao = i * num;
            System.out.println(num + " X " + i + " = " + multiplicacao);
        }

    }
}
