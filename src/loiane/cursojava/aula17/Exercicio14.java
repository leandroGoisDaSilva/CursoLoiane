package loiane.cursojava.aula17;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] numeros = new Integer[10];

        for(int i = 0; i < 10; i++){
            numeros[i] = random.nextInt(100);
            System.out.println(numeros[i]);
        }

        System.out.println("Números pares: ");
        for(int i = 0; i < 10; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + "/ ");
            }
        }

        System.out.println("Números impares: ");
        for(int i = 0; i < 10; i++){
            if(!(numeros[i] % 2 == 0)){
                System.out.print(numeros[i] + "/ ");
            }
        }
    }
}
