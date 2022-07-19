package com.edutecno.jparelaciones.videoclub.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "SQ_PELICULA", initialValue = 1, sequenceName = "SQ_PELICULA", allocationSize = 1)
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PELICULA")
    private Integer id;
    private String titulo;
    private String descripcion;
    private Integer duracion;


}
