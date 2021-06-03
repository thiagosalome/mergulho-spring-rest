package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@RestController // Diz ao Spring que se trata de um controlador REST
public class ClienteController {
    @PersistenceContext // Injeta um EntityManager nessa variável
    private EntityManager manager; // Interface do JakartaPersistence utilizada para fazer operações no banco de dados

    @GetMapping("/clientes") // Mapeia uma requisição do tipo GET
    public List<Cliente> listar() {
        return manager.createQuery("from Cliente", Cliente.class)
                .getResultList();
    }
}
