package com.algaworks.warmup.optional;

import com.algaworks.warmup.optional.domain.CatalogoProdutos;

import java.math.BigDecimal;

public class Exemplo2 {
    public static void main(String[] args) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

//      O .orElse é caso o valor esteja vazio
//        BigDecimal preco = catalogo.buscarPreco("Picanha 1kg").orElse(BigDecimal.ZERO);

        BigDecimal preco = catalogo.buscarPreco("Picanha 2kg")
                .orElseThrow(() -> new RuntimeException("Preço do produto não encontrado"));

        System.out.println(preco);
    }
}
