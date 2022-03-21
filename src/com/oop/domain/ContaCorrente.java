package com.oop.domain;
public class ContaCorrente {
    private int conta, agencia;
    private double saldo;
    private String nomeCliente;

    public ContaCorrente(){
        this.conta = 3579;
        this.agencia = 975;
        this.saldo = 100;
        this.nomeCliente = "Cliente Teste";
    }

    public ContaCorrente(int conta, int agencia, double saldo, String nomeCliente){
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }
    

    public int sacar(double valor){
        if(saldo - valor >= 0){
            saldo -= valor;;

            return 1;
        } else {return 0;}
    }

    public void depositar(double deposito){
        saldo += deposito;
    }

    public void imprimir(){
        System.out.println("+--------------------------------------+");
        System.out.println("|        Dados da Conta                |");
        System.out.println("+--------------------------------------|");
         System.out.printf(" Cliente: %s\n", nomeCliente);
         System.out.printf(" Agência: %d\n", agencia);
         System.out.printf(" Conta: %d\n", conta);
         System.out.printf(" Saldo: %.2f\n", saldo);
    }
    
}