package Exercicio27;

import java.util.Scanner;

public class TesteContaCorrent {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        ContaCorrente marcos = new ContaCorrente();
        System.out.println("Digite o valor do saque");
        Double saque = scan.nextDouble();

        marcos.numeroConta = 1;
        marcos.saldo = 20000.0;
        marcos.status = "Comum";
        marcos.limite = true;

        System.out.println(marcos.realizarSaque(marcos.saldo, saque));


        scan.close();
    }
}
