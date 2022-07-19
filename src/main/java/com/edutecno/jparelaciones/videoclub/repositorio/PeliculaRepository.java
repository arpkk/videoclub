package com.edutecno.jparelaciones.videoclub.repositorio;

import com.edutecno.jparelaciones.videoclub.modelo.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {

}
