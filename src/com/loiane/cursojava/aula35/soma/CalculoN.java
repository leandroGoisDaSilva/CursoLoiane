package com.loiane.cursojava.aula35.soma;

public class CalculoN {
    public static int valorN(int num){
        if(num == 1){
            return 1;
        }
        return num + valorN(num-1);
    }
}
