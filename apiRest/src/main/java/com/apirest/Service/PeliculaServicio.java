package com.apirest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.entidades.Pelicula;
import com.apirest.modelDTO.PeliculaDTO;
import com.apirest.modelDTO.PeliculaDetallesDTO;
import com.apirest.repositorios.PeliculaRepositorio;

@Service
public class PeliculaServicio {
	
	@Autowired
	private PeliculaRepositorio peliculaRepo;
	
	
	public ArrayList<PeliculaDetallesDTO> listarDetalles(){
		
		ArrayList<Pelicula> lista = (ArrayList<Pelicula>) peliculaRepo.findAll();
		ArrayList<PeliculaDetallesDTO> listaFinal= new ArrayList<>();
		
		for (Pelicula pelicula : lista) {
			PeliculaDetallesDTO peliDto = new PeliculaDetallesDTO();
			peliDto.setCalificacion(pelicula.getCalificacion());
			peliDto.setFechaCreacion(pelicula.getFechaCreacion());
			peliDto.setImagen(pelicula.getImagen());
			peliDto.setName(pelicula.getName());
			peliDto.setPersonajes(pelicula.getPersonajes());
			
			listaFinal.add(peliDto);
			
			
		}
		
		
		return listaFinal;
	}
	
	public ArrayList<PeliculaDTO> listarImgAndNameAndFecha()
	{
		ArrayList<Pelicula> lista = (ArrayList<Pelicula>) peliculaRepo.findAll();
		ArrayList<PeliculaDTO> listaFinal= new ArrayList<>();
		
		for (Pelicula pelicula : lista) {
			PeliculaDTO peliDto = new PeliculaDTO ();
			
			peliDto.setFechaCreacion(pelicula.getFechaCreacion());
			peliDto.setImagen(pelicula.getImagen());
			peliDto.setName(pelicula.getName());
			
			listaFinal.add(peliDto);
		
		
		
	}
		return listaFinal;
	
}
}
