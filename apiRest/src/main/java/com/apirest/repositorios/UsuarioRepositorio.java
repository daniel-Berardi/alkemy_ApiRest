package com.apirest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.entidades.Usuario;

@Repository
public interface UsuarioRepositorio  extends JpaRepository<Usuario,Integer>{

}
