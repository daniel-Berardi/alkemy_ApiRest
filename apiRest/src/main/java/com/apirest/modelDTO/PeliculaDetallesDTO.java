package com.apirest.modelDTO;

import java.util.Set;



import com.apirest.entidades.Personaje;


public class PeliculaDetallesDTO {
	
	
	
	
	private String name;
	
	private String fechaCreacion;
	
	private int calificacion;
	
	private Byte[] imagen;
	
	
	private Set<Personaje> personajes;
	
	
	


	public PeliculaDetallesDTO() {
		super();
	}


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public Byte[] getImagen() {
		return imagen;
	}


	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}


	public Set<Personaje> getPersonajes() {
		return personajes;
	}


	public void setPersonajes(Set<Personaje> personajes) {
		this.personajes = personajes;
	}
	
	
	

}
