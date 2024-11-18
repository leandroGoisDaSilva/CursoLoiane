package com.loiane.cursojava.aula20;

public class Calendario {

    public void imprimirCalendario(){
        int[][] calendario = new int[7][7];
        int dia = 1;

        String[] diaSemana = new String[]{" D |", " S  |"," T  |"," Q  |"," Q  |"," S  |"," S  |"};
        for(int i = 0; i < diaSemana.length; i++){
            System.out.print(diaSemana[i]);
        }

        System.out.println();
        for(int i = 0; i < calendario.length; i++){
            for(int j = 0; j < calendario.length; j++){
                if(dia < 32){
                    if(dia < 10){
                        System.out.printf("0%d ", dia++);
                        System.out.print("| ");
                    } else {
                        System.out.print(dia++ + " | ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


