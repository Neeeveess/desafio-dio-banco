package com.jvneves;

import lombok.Data;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

}
