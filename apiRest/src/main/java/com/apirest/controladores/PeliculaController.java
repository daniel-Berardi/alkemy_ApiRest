package com.apirest.controladores;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.Service.PeliculaServicio;
import com.apirest.entidades.Pelicula;

import com.apirest.modelDTO.PeliculaDTO;
import com.apirest.modelDTO.PeliculaDetallesDTO;

import com.apirest.repositorios.PeliculaRepositorio;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
@RequestMapping("/movies")
public class PeliculaController {
	
	@Autowired
	private PeliculaServicio peliculaServicio;
	@Autowired
	private PeliculaRepositorio peliculaRepo;
	
	
	@GetMapping()
	public ArrayList<PeliculaDTO> listarImgAndNameAndFecha()
	{
		
		
		return peliculaServicio.listarImgAndNameAndFecha();
	}
	
	@GetMapping("/detalles")
	public ArrayList<PeliculaDetallesDTO> listarDetalles(){
		
		
		
		return peliculaServicio.listarDetalles();
	}
	
	@GetMapping("/movie")
	public Iterable<Pelicula> fintrado(
			@Join(path="genero", alias ="g")@And({
				@Spec(path = "g.id",params = "idGenre",spec = Equal.class),
				@Spec(path = "name",params="name",spec=Equal.class)
			
			})Specification<Pelicula> spec){
		
		return peliculaRepo.findAll(spec);
	}
	}
			
			
		
		
		
	
	
	

