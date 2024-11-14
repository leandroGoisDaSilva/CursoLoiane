package loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
        int n = scan.nextInt();

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

        for(int i = 3; i < n; i++){
            fibo = num + num2;
            num = num2;
            num2 = fibo;

            System.out.print(fibo + "/ ");
        }

    }
}
