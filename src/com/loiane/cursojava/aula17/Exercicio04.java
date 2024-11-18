package com.loiane.cursojava.aula17;

public class Exercicio04 {
    public static void main (String[] args){
        Double populacaoA = 80000.0;
        double taxaCrescimentoA = 1.03;


        Double populacaoB = 200000.0;
        double taxaCrescimentoB = 1.015;

        int anos = 0;

        while(populacaoA < populacaoB) {
            anos++;
            populacaoA = populacaoA * taxaCrescimentoA;
            populacaoB = populacaoB * taxaCrescimentoB;
        }
        System.out.println("População A:" + populacaoA);
        System.out.println("População B:" + populacaoB);
        System.out.println("Anos para A ultrapassar B: " + anos);




    }
}
