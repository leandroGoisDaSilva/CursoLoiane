package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendario calendario = new Calendario();

        calendario.imprimirCalendario();

        String[][] compromissos = new String[31][24];
        byte opcao;

        boolean sair = false;
        while (!sair) {
            System.out.println("=====================================");
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextByte();

            if (opcao == 1) {
                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Digite o dia do compromisso: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.err.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Qual horário?");
                    hora = scan.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.err.println("Horário inválido, digite uma hora válida");
                    }
                }
                scan.nextLine();
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = scan.nextLine();
            } else if (opcao == 2) {

                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Digite o dia do compromisso: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.err.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Qual horário do compromisso?");
                    hora = scan.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.err.println("Horário inválido, digite uma hora válida");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);

            } else if(opcao == 0){
                sair = true;
            } else {
                System.err.println("Opção inválida, digite uma opção válida");
            }

        }


    }
}
