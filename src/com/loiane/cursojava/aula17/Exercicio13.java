package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base de calculo de uma potência: ");
        Integer base = scan.nextInt();

        System.out.print("Digite o valor do expoente da potência: ");
        Integer expoente = scan.nextInt();

        Integer total = base;

        for(int i = 1; i < expoente; i++){
            total *= base;
        }
        System.out.println(total);

    }
}
