package com.edutecno.jparelaciones.videoclub.repositorio;

import com.edutecno.jparelaciones.videoclub.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
