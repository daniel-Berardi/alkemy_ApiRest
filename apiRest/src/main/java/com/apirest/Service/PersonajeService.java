package com.apirest.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.entidades.Personaje;
import com.apirest.modelDTO.PersonajeDTO;
import com.apirest.modelDTO.PersonajeDetallesDTO;
import com.apirest.repositorios.PersonajeRepositorio;

@Service
public class PersonajeService {

	
	@Autowired
	private PersonajeRepositorio personajeRepo;
	
	
	
	public ArrayList<PersonajeDetallesDTO> detallePersonajes(){
		
		ArrayList<Personaje> lista = (ArrayList<Personaje>) personajeRepo.findAll();
		ArrayList<PersonajeDetallesDTO> listaFinal= new ArrayList<>();
		
		for (Personaje personaje : lista) {
			PersonajeDetallesDTO pjdetalle = new PersonajeDetallesDTO();
			
			pjdetalle.setNombre(personaje.getName());
			pjdetalle.setImagen(personaje.getImagen());
			pjdetalle.setEdad(personaje.getEdad());
			pjdetalle.setHistoria(personaje.getHistoria());
			pjdetalle.setPeliculas(personaje.getPeliculas());
			pjdetalle.setPeso(personaje.getPeso());
			
			listaFinal.add(pjdetalle);
		}
		
		
		return listaFinal;
	}
	
	public ArrayList<PersonajeDTO> listarIMGandNamePersonajes(){
		
		ArrayList<Personaje> lista = (ArrayList<Personaje>) personajeRepo.findAll();
		ArrayList<PersonajeDTO> listaFinal= new ArrayList<>();
		for (Personaje personaje : lista) {
			PersonajeDTO pjdto = new PersonajeDTO();
			
			pjdto.setNombre(personaje.getName());
			pjdto.setImagen(personaje.getImagen());
			
			
			listaFinal.add(pjdto);
		}
		
		
		return listaFinal;
	}
	
	
}
