package com.algaworks.algalog.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@EqualsAndHashCode(onlyExplicitlyIncluded = true) // O parâmetro onlyExplicitlyIncluded diz o lombok para gera os métodos Equals e HashCode apenas para aqueles que eu desejar incluir
@Getter
@Setter
@Entity // Define que a classe representa uma entidade. Caso o nome da tabela fosse diferente da entidade, então teria que adicionar a anotação @Table(name = "nome_tabela")
public class Cliente {
    @EqualsAndHashCode.Include // Serão gerados os métodos Equals e HashCode apenas para o id
    @Id // Define a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia de geração da chave configurada para utilizar a mesma do banco de dados
    private Long id;
    // Como todas possuem o mesmo nome que o cadastrado no banco de dados, não é necessário adicionar a anotação @Column
    private String nome;
    private String email;
    private String telefone;
}
