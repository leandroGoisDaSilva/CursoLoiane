package com.loiane.cursojava.aula33.labs.contacorrente;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(123456);
        cc.setEspecial(true);
        cc.setCliente("Leandro");
        cc.setSaldo(1000);
        cc.setLimite(0);
        cc.setEspecial(false);

        cc.depositar(500);
        cc.sacar(1400);

//        cc.consultarSaldo();
        cc.exibirExtrato();
    }
}
