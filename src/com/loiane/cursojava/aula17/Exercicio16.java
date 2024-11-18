package com.loiane.cursojava.aula17;

public class Exercicio16 {
    public static void main(String[] args) {

        int num = 1;
        int num2 = 1;
        int fibo;

        //1,1,2,3,5
        //num = 1
        //num2 = 2
        //fibo = 3

        System.out.println("Sequência Fibonacci");
        System.out.print(num + "/ ");
        System.out.print(num2 + "/ ");

        do{
            fibo = num + num2;
            num = num2;
            num2 = fibo;
            System.out.print(fibo + "/ ");
        }while (fibo < 500);
    }
}
