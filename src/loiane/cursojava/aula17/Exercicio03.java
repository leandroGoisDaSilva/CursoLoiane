package loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        boolean infoValida;
        String nome;

        do{
            System.out.println("Digite seu nome:");
            nome = scan.next();

            if(nome.length() <= 3){
                System.err.println("O nome precisas ter mais que 3 caracteres!");
                infoValida = false;
            } else {
                infoValida = true;
            }

        } while (!infoValida);

        int idade;
        do{
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();

            if(!((idade > 0) && (idade <= 150))){
                System.err.println("Idade precisa ser entra 0 - 150!");
                infoValida = false;
            } else {
                infoValida = true;
            }

        } while (!infoValida);

        double salario;
        do{
            System.out.println("Digite seu salário:");
            salario = scan.nextDouble();

            if(!(salario>0)){
                System.err.println("Salário precisa ser maior que 0!");
                infoValida = false;
            } else {
                infoValida = true;
            }

        } while (!infoValida);

        String sexo;
        do{
            System.out.println("Qual seu sexo?");
            sexo = scan.next();

            if(!((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m")))){
                System.err.println("Digite um valor válido f ou m!");
                infoValida = false;
            } else {
                infoValida = true;
            }

        } while (!infoValida);

        String estadoCivil;
        do{
            System.out.println("Qual seu estado Civil?");
            estadoCivil = scan.next();

            if(!((estadoCivil.equalsIgnoreCase("s")) || (estadoCivil.equalsIgnoreCase("c")) ||
                    ((estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))))){
                System.err.println("Digite um valor válido!");
                System.err.println("[s] - Solteiro | [c] - Casado | [v] - Viuvo | [d] - Divorciado");
                infoValida = false;

            } else {
                infoValida = true;
            }

        } while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo: Feminino ");
        } else {
            System.out.println("Sexo: Masculino");
        }

        if(estadoCivil.equalsIgnoreCase("s")){
            System.out.println("Estado Civil: Solteiro ");
        } else if (estadoCivil.equalsIgnoreCase("c")){
            System.out.println("Estado Civil: Casado ");
        } else if (estadoCivil.equalsIgnoreCase("v")) {
            System.out.println("Estado Civil: Viuvo ");
        }else if (estadoCivil.equalsIgnoreCase("d")) {
            System.out.println("Estado Civil: Divorciado ");
        }


        scan.close();
    }
}
