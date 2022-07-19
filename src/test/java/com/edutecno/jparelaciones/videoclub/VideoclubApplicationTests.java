package com.edutecno.jparelaciones.videoclub;

import com.edutecno.jparelaciones.videoclub.modelo.Arriendo;
import com.edutecno.jparelaciones.videoclub.modelo.Cliente;
import com.edutecno.jparelaciones.videoclub.modelo.Pelicula;
import com.edutecno.jparelaciones.videoclub.repositorio.ArriendoRepository;
import com.edutecno.jparelaciones.videoclub.repositorio.ClienteRepository;
import com.edutecno.jparelaciones.videoclub.repositorio.PeliculaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VideoclubApplicationTests {

    @Autowired
    private ArriendoRepository arriendoRepository;

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void contextLoads() {
        Pelicula jurassicPark = new Pelicula(null, "Jurassic Park", "Una peli de dinosaurios", 180);
        peliculaRepository.save(jurassicPark);

        Cliente cliente = new Cliente(null,"Mark");
        clienteRepository.save(cliente);


        Arriendo arriendo = new Arriendo(null, "15/7/2022", 7, jurassicPark, cliente);
        arriendoRepository.save(arriendo);

    }

}
