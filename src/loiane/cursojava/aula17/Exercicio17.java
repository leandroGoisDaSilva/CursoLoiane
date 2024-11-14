package loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do fatorial a ser calculado: ");
        int fat = scan.nextInt();
        int numFat = fat;
        int total = 1;


        for(int i = fat; i > 1; i--){
            total *= fat--;
        }
        System.out.println(numFat + "! = " + total);
    }

}
