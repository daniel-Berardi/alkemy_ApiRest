package com.apirest.repositorios;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.entidades.Pelicula;

@Repository
public interface PeliculaRepositorio  extends JpaRepository<Pelicula, Integer>{

	Iterable<Pelicula> findAll(Specification<Pelicula> spec);

}
