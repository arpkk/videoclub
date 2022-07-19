package com.edutecno.jparelaciones.videoclub.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "SQ_ARRIENDO", initialValue = 1, sequenceName = "SQ_ARRIENDO", allocationSize = 1)
public class Arriendo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ARRIENDO")
    private Integer id;
    private String inicio;
    private Integer duracion;

    /*
    @OneToOne(cascade = CascadeType.ALL)//si se borra un arriendo se borran las peliculas
    @JoinColumn(name = "pelicula_id", referencedColumnName = "id") //clave foranea, tipo inner join
    private Pelicula pelicula;
     */

    @ManyToOne
    @JoinColumn(name="pelicula_id", referencedColumnName = "id")
    private Pelicula pelicula;


    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName = "id")
    private Cliente cliente;




}
