package com.apirest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.entidades.Genero;


@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Integer>{

}
