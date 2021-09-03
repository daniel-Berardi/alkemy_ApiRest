package com.apirest.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.entidades.Genero;
import com.apirest.entidades.Pelicula;
import com.apirest.entidades.Personaje;
import com.apirest.repositorios.GeneroRepositorio;
import com.apirest.repositorios.PeliculaRepositorio;
import com.apirest.repositorios.PersonajeRepositorio;

@RestController
@RequestMapping("/crud")
public class CrudController {
	
	@Autowired
	private PersonajeRepositorio personajeRepo;
	
	@Autowired
	private PeliculaRepositorio peliculaRepo;
	
	@Autowired
	private GeneroRepositorio generoRepo;
	
	
	
	//----------CRUD personajes
	
	@GetMapping("/listarPersonajes")
	public ArrayList<Personaje> listarPersonajes(){
		
		
		return (ArrayList<Personaje>) personajeRepo.findAll();
	}
	
	
	@PostMapping("/crearPersonajes")
	public void CrearPersonaje(@RequestBody Personaje personaje) {
		
		personajeRepo.save(personaje);
		
	}
	@PutMapping("/actualizarPersonaje")
	public void ActualizarPersonaje(@RequestBody Personaje personaje) {
		
		personajeRepo.save(personaje);
	}
	@DeleteMapping("/eliminarPersonajePorID/{id}")
	public void EliminarPersonajePorId(@PathVariable("id")int id){
		
		personajeRepo.deleteById(id);
	}

	//------------CRUD peliculas
	
	@GetMapping("/listarPeliculas")
	public ArrayList<Pelicula> listarpeliculas(){
		
		
		return (ArrayList<Pelicula>) peliculaRepo.findAll();
	}
	
	
	@PostMapping("/crearPelicula")
	public void CrearPelicula(@RequestBody Pelicula pelicula) {
		
		peliculaRepo.save(pelicula);
		
	}
	@PutMapping("/actualizarPelicula")
	public void ActualizarPelicula(@RequestBody Pelicula pelicula) {
		
		peliculaRepo.save(pelicula);
	}
	@DeleteMapping("/eliminarPeliculaPorID/{id}")
	public void EliminarPeliculaPorId(@PathVariable("id")int id){
		
		peliculaRepo.deleteById(id);
	}
	
	//----------CRUD generos
	
	
	@GetMapping("/listarGeneros")
	public ArrayList<Genero> listarGeneros(){
		
		
		return (ArrayList<Genero>) generoRepo.findAll();
	}
	
	
	@PostMapping("/crearGenero")
	public void CrearGenero(@RequestBody Genero genero) {
		
		generoRepo.save(genero);
		
	}
	@PutMapping("/actualizarGenero")
	public void ActualizarGenero(@RequestBody Genero genero) {
		
		generoRepo.save(genero);
	}
	@DeleteMapping("/eliminarGeneroPorID/{id}")
	public void EliminarGeneroPorId(@PathVariable("id")int id){
		
		generoRepo.deleteById(id);
	}
	
	

}
