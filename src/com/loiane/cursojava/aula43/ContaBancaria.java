package com.loiane.cursojava.aula43;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {}

    public ContaBancaria(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Conta Bancaria[";
        s += " nomeCliente " + nomeCliente;
        s += "; numConta " + numConta;
        s += "; saldo " + saldo;
        s += "]";
        return s;
    }
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso");
    }
    public boolean sacar(double valor){
        if((this.saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }

        return false;

    }
//    public void numeroConta(){
//        int num = 0;
//        this.numConta += num++;
//    }
}
