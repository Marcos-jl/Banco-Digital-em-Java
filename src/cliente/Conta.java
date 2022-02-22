package cliente;

import groovy.console.ui.SystemOutputInterceptor;

public abstract class Conta implements Iconta{
    private static final int AGENCIA_PADRAO = 1229;
    private static int SEQUENCIAL = 4448;

    private String nome;
    private int agencia;
    private int conta;
    private double saldo = 0.0;

    public Conta(String nome){
        this.nome = nome;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Titular: " + this.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: " + this.saldo + " R$");
        System.out.println();

    }
}
