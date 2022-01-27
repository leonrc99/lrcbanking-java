package com.lrcbanking;

public class Main {
    public static void main(String[] args){
        Cliente leonardoRC = new Cliente();
        Cliente yolandaFS = new Cliente();
        leonardoRC.setNome("Leonardo Rodrigues Cardozo");
        yolandaFS.setNome("Yolanda Ferreira de Souza");


        Conta cc[]= {new ContaCorrente(leonardoRC), new ContaCorrente(yolandaFS)};
        Conta poupanca[] = {new ContaPoupanca(leonardoRC), new ContaPoupanca(yolandaFS) {
        }};

        cc[0].depositar(1000);
        cc[1].depositar(1000);
        cc[1].transferir(130, cc[0]);
        cc[0].transferir(243, cc[1]);

        cc[0].printExtrato();
        poupanca[0].printExtrato();

        cc[1].printExtrato();
        poupanca[1].printExtrato();
    }
}
