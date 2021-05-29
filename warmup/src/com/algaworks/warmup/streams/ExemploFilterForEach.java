package com.algaworks.warmup.streams;

import com.algaworks.warmup.streams.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilterForEach {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Água 2L", Produto.Status.ATIVO, new BigDecimal(9.9)));
        produtos.add(new Produto("Picanha 1kg", Produto.Status.ATIVO, new BigDecimal(109.5)));
        produtos.add(new Produto("Carvão", Produto.Status.INATIVO, new BigDecimal(34.2)));
        produtos.add(new Produto("Cerveja 600ml", Produto.Status.ATIVO, new BigDecimal(8.4)));
        produtos.add(new Produto("Cupim 2kg", Produto.Status.ATIVO, new BigDecimal(92)));

//        for (Produto produto: produtos) {
//            if (produto.getNome().startsWith("C")) {
//                produto.inativar();
//            }
//        }

//        A Streams API é uma forma de manipular Collections utilizando princípios da programação funcional


//        Modo 1
//        Predicate<Produto> predicate = p -> p.getNome().startsWith("C"); // O predicate funciona como uma condição
//        Consumer<Produto> consumer = p -> p.inativar();
//        Stream<Produto> produtosStream = produtos.stream().filter(predicate);
//        produtosStream.forEach(consumer);

//        Modo 2 - Passando o consumer e predicate diretamente
//        Stream<Produto> produtosStream = produtos.stream().filter(p -> p.getNome().startsWith("C")); // Bem semelhante ao Javascript
//        produtosStream.forEach(produto -> produto.inativar());

//        Modo 3 - Chamando o forEach logo após o filter
        produtos.stream()
                .filter(produto -> produto.getNome().startsWith("C"))
                .forEach(Produto::inativar);
    }
}
