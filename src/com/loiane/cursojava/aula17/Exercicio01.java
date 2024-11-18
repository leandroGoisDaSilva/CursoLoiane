package com.loiane.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double nota;

        do{
            try {
                System.out.println("Digite sua nota: ");
                nota = scan.nextDouble();

                if (notaValida(nota)) {

                    System.out.println("Você digitou: " + nota);
                } else {
                    System.err.println("Nota Inválida! Digite novamente.");
                }
            } catch(InputMismatchException e){
                    System.err.println("Valor inválido, digite um valor válido");
                    scan.nextLine();
                    nota = -1;
            }

        } while(!notaValida(nota));


        scan.close();
    }
    static boolean notaValida(double nota){
        return nota >= 0 && nota <= 10;
    }

}
