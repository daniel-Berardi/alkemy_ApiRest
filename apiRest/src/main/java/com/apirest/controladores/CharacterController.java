package com.apirest.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.Service.PersonajeService;
import com.apirest.entidades.Personaje;
import com.apirest.modelDTO.PersonajeDTO;
import com.apirest.modelDTO.PersonajeDetallesDTO;
import com.apirest.repositorios.PersonajeRepositorio;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
@RequestMapping("/characters")
public class CharacterController {
	
	@Autowired
	private PersonajeService personajeService;
	
	@Autowired
	private PersonajeRepositorio personajeRepo;

	
	@GetMapping("/detalles")
	public ArrayList<PersonajeDetallesDTO> listarDetalles(){
		
		return personajeService.detallePersonajes();

	}
	
	
	@GetMapping("/character")
	public Iterable<Personaje> filtrado(@Join(path = "peliculas", alias = "p") @And({
			@Spec(path = "p.id", params = "idMovie", spec = Equal.class),
			@Spec(path = "edad", params = "age", spec = Equal.class),
			@Spec(path = "name", params = "name", spec = Equal.class) }) Specification<Personaje> spec

	) {
		return personajeRepo.findAll(spec);
	}
	
	@GetMapping()
	public ArrayList<PersonajeDTO> listarNameAndImg(){
		
		
		return personajeService.listarIMGandNamePersonajes();
		
	}
}
