package loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean infoValida;
        String nome;
        String senha;
        /*Declarar variável fora do Loop é uma boa prática para que caso eu queira utilizar as variáveis novamente*/
                do{
                    System.out.println("Digite o nome de usuário:");
                    nome = scan.nextLine();
                    System.out.println("Digite sua senha:");
                    senha = scan.nextLine();

                    if(nome.equalsIgnoreCase(senha)){
                        infoValida = false;
                        System.err.println("Nome de usuário não pode ser igual a senha");

                    } else {
                        infoValida = true;
                        System.out.println("Acesso liberado!");
                    }

                } while(!infoValida);

        scan.close();
    }
}
