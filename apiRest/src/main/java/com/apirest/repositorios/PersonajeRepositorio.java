package com.apirest.repositorios;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.entidades.Personaje;

@Repository
public interface PersonajeRepositorio extends JpaRepository<Personaje, Integer> {

	Iterable<Personaje> findAll(Specification<Personaje> spec);

}
