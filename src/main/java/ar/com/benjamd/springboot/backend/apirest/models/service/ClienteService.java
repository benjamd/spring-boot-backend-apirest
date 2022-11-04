package ar.com.benjamd.springboot.backend.apirest.models.service;

import ar.com.benjamd.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    void delete(Long id);
}
