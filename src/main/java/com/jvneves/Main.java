package com.jvneves;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco do Japao");

        Cliente joao = new Cliente();
        joao.setNome("João");

        Cliente jorge = new Cliente();
        jorge.setNome("Jorge");

        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaCorrente(jorge);

        cc.depositar(1000);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        List<Cliente> listClientes = new ArrayList<>();
        listClientes.add(joao);
        listClientes.add(jorge);

        banco.setClientes(listClientes);

        banco.getClientes().forEach(cliente -> System.out.println(cliente.getNome()));


    }
}
