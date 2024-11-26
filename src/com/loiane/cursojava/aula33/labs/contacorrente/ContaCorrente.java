package com.loiane.cursojava.aula33.labs.contacorrente;

public class ContaCorrente {
    private int numero;
    private String cliente;
    private double saldo;
    private boolean especial;
    private double limite; //Banco disse que esse

    public ContaCorrente() {}

    public ContaCorrente(int numero, String cliente, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void sacar(double valorSaque){
        //Verificar se o cliente pode ou não sacar
        System.out.println("=== SAQUE ===");
        if(especial){
            if ((saldo - valorSaque) > limite) {
                saldo -= valorSaque;
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saque não realizado! Saldo insuficiente!");
            }
        } else if ((saldo - valorSaque) >= 0){
            saldo -= valorSaque;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque não realizado! Saldo insuficiente!");
        }
        System.out.println();
    }
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public void consultarSaldo(){
            System.out.println("Seu saldo é: " + this.saldo);
    }
    public void exibirExtrato(){
        System.out.println("=== EXIBINDO EXTRATO ===");
        System.out.println("Número da Conta: "+ getNumero());
        System.out.println("Nome: " + getCliente());
        if(especial){
            System.out.println("Cheque especial: " + getLimite() * (-1));
        }
        consultarSaldo();
    }

}
