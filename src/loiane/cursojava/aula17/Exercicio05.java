package loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Double populacaoA;
        Double populacaoB;
        Double taxaCrescimentoA;
        Double taxaCrescimentoB;
        boolean valido = true;

        do {
            System.out.print("Digite o número da População A: ");
            populacaoA = scan.nextDouble();
            System.out.print("Qual a taxa de crescimento dela em %: ");
            taxaCrescimentoA = scan.nextDouble();

            if(populacaoA > 0 && taxaCrescimentoA > 0){
                valido = true;
                taxaCrescimentoA = taxaPercentual(taxaCrescimentoA);
            } else {
                valido = false;
                System.err.println("Tanto a população A quanto a taxa devem ser maior que 0");
            }
        }while(!valido);

        do {
            System.out.print("Digite o número da População B: ");
            populacaoB = scan.nextDouble();
            System.out.print("Qual a taxa de crescimento dela em %: ");
            taxaCrescimentoB = scan.nextDouble();

            if(populacaoB > 0 && taxaCrescimentoB > 0){
                valido = true;
                taxaCrescimentoB = taxaPercentual(taxaCrescimentoB);
            } else {
                valido = false;
                System.err.println("Tanto a população B quanto a taxa devem ser maior que 0");
            }
        }while(!valido);

        int anos = 0;

        while(populacaoA < populacaoB) {
            anos++;
            populacaoA = populacaoA * taxaCrescimentoA;
            populacaoB = populacaoB * taxaCrescimentoB;
        }
        System.out.println("População A:" + populacaoA);
        System.out.println("População B:" + populacaoB);
        System.out.println("Anos para A ultrapassar B: " + anos);

        scan.close();
    }
    static double taxaPercentual (double percentual){
        return (percentual/100) +1;
    }
}
