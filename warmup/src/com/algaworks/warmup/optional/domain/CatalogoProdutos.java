package com.algaworks.warmup.optional.domain;

import com.algaworks.warmup.optional.domain.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoProdutos {
    List<Produto> produtos = new ArrayList<>();

    public CatalogoProdutos() {
        this.produtos.add(new Produto("Água 2L", Produto.Status.ATIVO, new BigDecimal(9.9)));
        this.produtos.add(new Produto("Picanha 1kg", Produto.Status.ATIVO, new BigDecimal(109.5)));
        this.produtos.add(new Produto("Carvão", Produto.Status.INATIVO, new BigDecimal(34.2)));
        this.produtos.add(new Produto("Cerveja 600ml", Produto.Status.ATIVO, new BigDecimal(8.4)));
        this.produtos.add(new Produto("Cupim 2kg",Produto.Status.ATIVO, new BigDecimal(92)));
    }

    public Produto buscar(String nomeProduto) {
        // Reference: https://www.baeldung.com/find-list-element-java#5-java-8-stream-api
        Produto produtoEncontrado = this.produtos.stream()
                .filter(produto -> produto.getNome().equals(nomeProduto))
                .findAny() // Retorna o primeiro elemento que bate com a condição de filtro
                .orElse(null);
        return produtoEncontrado;
    }

    public Optional<Produto> buscarOptional(String nomeProduto) {
        // Reference: https://www.baeldung.com/find-list-element-java#5-java-8-stream-api
        Produto produtoEncontrado = this.produtos.stream()
                .filter(produto -> produto.getNome().equals(nomeProduto))
                .findAny() // Retorna o primeiro elemento que bate com a condição de filtro
                .orElse(null);

        return Optional.ofNullable(produtoEncontrado);
    }

    public Optional<BigDecimal> buscarPreco(String nomeProduto) {
        Produto produtoEncontrado = this.produtos.stream()
                .filter(produto -> produto.getNome().equals(nomeProduto))
                .findAny()
                .orElse(null);

        return Optional.ofNullable(produtoEncontrado.getPreco());
    }
}
