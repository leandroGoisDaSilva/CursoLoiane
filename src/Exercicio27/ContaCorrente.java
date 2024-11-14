package Exercicio27;

import java.sql.SQLOutput;

public class ContaCorrente {

    Integer numeroConta;
    Double saldo;
    String status;
    boolean limite;

    //Método para realizar saques
    Double realizarSaque(Double saldoDaConta, Double saque) {
        boolean saquePermitido = true;
        Double saqueRealizado = 0.0;


            if(status.equalsIgnoreCase("Especial")){
                System.out.println("Saque realizado com sucesso");
                 saqueRealizado = saldo - saque;
                 saquePermitido = status.equalsIgnoreCase("Especial");

            }
            do{
                if (saque <= (saldoDaConta * 0.2)) {
                System.out.println("Saque realizado com sucesso");
                saqueRealizado = saldo - saque;

                } else {
                System.out.println("O limite de saque é: " + saldoDaConta * 0.2);
                saquePermitido = false;

                }
            } while(saquePermitido);

         return saqueRealizado;
    }

    //Método para realizar Depositos
    boolean realizarDeposito(Double valorASerDepositado, boolean depositoPermitido) {
        depositoPermitido = valorASerDepositado <= 0.8;

        do {
            if (status.equalsIgnoreCase("Especial")) {
                depositoPermitido = true;
                System.out.println("Deposito realizado com sucesso");

            } else if (depositoPermitido) {
                System.out.println("Deposito realizado com sucesso");
                depositoPermitido = true;

            } else {
                System.out.println("Seu limite de depósito é: " + saldo * 0.2);
                depositoPermitido = false;

            }
        } while (!depositoPermitido);

        return depositoPermitido;
    }


}
