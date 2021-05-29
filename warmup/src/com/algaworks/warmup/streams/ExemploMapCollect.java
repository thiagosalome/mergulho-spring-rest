package com.algaworks.warmup.streams;

import com.algaworks.warmup.streams.model.Categoria;
import com.algaworks.warmup.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploMapCollect {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Categoria categoriaBebidas = new Categoria("Bebidas");
        Categoria categoriaCarnes = new Categoria("Carnes");
        Categoria categoriaOutros = new Categoria("Outros");

        produtos.add(new Produto("Água 2L", Produto.Status.ATIVO, new BigDecimal(9.9), categoriaBebidas));
        produtos.add(new Produto("Picanha 1kg", Produto.Status.ATIVO, new BigDecimal(109.5), categoriaCarnes));
        produtos.add(new Produto("Carvão", Produto.Status.INATIVO, new BigDecimal(34.2), categoriaBebidas));
        produtos.add(new Produto("Cerveja 600ml", Produto.Status.ATIVO, new BigDecimal(8.4), categoriaBebidas));
        produtos.add(new Produto("Cupim 2kg", Produto.Status.ATIVO, new BigDecimal(92), categoriaCarnes));

//        List<String> tipoCategorias = new ArrayList<>();
//        for (Produto produto : produtos) {
//            if (produto.getStatus().equals(Produto.Status.ATIVO)) {
//                String categoria = produto.getCategoria().getTipo();
//
//                if (!tipoCategorias.contains(categoria)) {
//                    tipoCategorias.add(categoria);
//                }
//            }
//        }

        List<String> tipoCategorias = produtos.stream()
                .filter(produto -> produto.getStatus().equals(Produto.Status.ATIVO))
                .map(produto -> produto.getCategoria().getTipo())
                .distinct() // Retorna um stream apenas com elementos distintos
                .collect(Collectors.toList()); // Uma operação de redução

        System.out.println(tipoCategorias);
    }
}
