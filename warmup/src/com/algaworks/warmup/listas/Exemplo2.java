package com.algaworks.warmup.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1L, "José"));
        clientes.add(new Cliente(2L, "Maria"));
        clientes.add(new Cliente(3L, "João"));

//        O cliente.getId() vai substituir o %d
//        O cliente.getNome() vai substituir o %s
//        O %n é uma quebra de linha
        clientes.forEach(cliente -> System.out.printf("Id: %d, Nome: %s%n", cliente.getId(), cliente.getNome()));
    }
}
