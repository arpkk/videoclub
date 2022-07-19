package com.edutecno.jparelaciones.videoclub.repositorio;

import com.edutecno.jparelaciones.videoclub.modelo.Arriendo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriendoRepository extends CrudRepository<Arriendo, Integer> {

}
