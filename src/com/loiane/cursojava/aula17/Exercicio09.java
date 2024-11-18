package com.loiane.cursojava.aula17;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] num = new int[51];

        for(int i = 0; i < num.length; i++){
            num[i] = i;

            if(num[i] % 2 == 0){
                System.out.println(num[i] + " é par!");
            }
        }

    }
}
