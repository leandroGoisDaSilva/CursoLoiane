package loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(50);
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("*********************************************************");

        Double contPar = 0.0;
        Double contImpar = 0.0;

        System.out.println("=====Percentual de Números Pares=====");
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                System.out.print(vetorA[i] + "/ ");
                contPar++;
            }
        }
        System.out.println("Percentual: " + (contPar / vetorA.length) * 100 + "%");


        System.out.println("=====Percentual de Números Impares=====");
        for (int i = 0; i < vetorA.length; i++){
            if(!(vetorA[i] % 2 == 0)){
                System.out.print(vetorA[i] + "/ ");
                contImpar++;
            }
        }
        System.out.println("Percentual: " + (contImpar / vetorA.length) * 100 + "%");
    }
}
