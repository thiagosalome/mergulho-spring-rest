package com.algaworks.warmup.listas;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Exemplo1 {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("João");

//        nomes.remove(0); // Remove o índice
//        nomes.remove("Maria"); // Remove o objeto

//        System.out.println(nomes); Renderiza todos os nomes

//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println("Nome: " + nomes.get(i));
//        }

//        for (String nome : nomes) {
//            System.out.println("Nome: " + nome);
//        }

//        O Consumer é uma Interface funcional, ou seja, é uma Interface que contém um único método abstrato. Ela possui uma anotação chamada @FunctionalInterface
//        nomes.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        Esse formato é chamado de lambda expression. Bem semelhante o Javascript
//        nomes.forEach(nome -> {
//            System.out.println(nome);
//        });

        nomes.forEach(System.out::println);
    }
}