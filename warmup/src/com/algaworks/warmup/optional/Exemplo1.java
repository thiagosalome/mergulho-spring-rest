package com.algaworks.warmup.optional;

import com.algaworks.warmup.optional.domain.CatalogoProdutos;
import com.algaworks.warmup.optional.domain.Produto;

import java.math.BigDecimal;
import java.util.Optional;

public class Exemplo1 {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

//        Produto produto = catalogo.buscar("Picanha 1kg");

//        Ao buscar por um produto que não existe ocorre o famoso erro do NullPointerException. Ela acontece quando tentamos utilizar uma variável que não tem uma instância atribuída a ela
//        Produto produto = catalogo.buscar("Picanha 2kg");

//        Adicionando o if eu faço o tratamento do null
//        if (produto != null) {
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        }

//        Outra forma é com a utilização do Optional
        Optional<Produto> produtoOptional = catalogo.buscarOptional("Picanha 1kg");

//        if (produtoOptional.isPresent()) {
//            Produto produto = produtoOptional.get();
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        }

//        Se o produto estiver presente
//        produtoOptional.ifPresent(produto -> {
//            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//            System.out.println(produto.getPreco());
//        });

//        Utilizando a API de Stream
        produtoOptional.stream().forEach(produto -> {
            produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
            System.out.println(produto.getPreco());
        });
    }
}
