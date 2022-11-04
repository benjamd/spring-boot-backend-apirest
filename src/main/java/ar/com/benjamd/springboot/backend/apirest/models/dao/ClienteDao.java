package ar.com.benjamd.springboot.backend.apirest.models.dao;

import ar.com.benjamd.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente,Long> {

}
