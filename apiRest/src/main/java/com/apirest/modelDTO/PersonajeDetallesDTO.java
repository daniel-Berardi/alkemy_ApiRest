package com.apirest.modelDTO;

import java.util.Set;

import com.apirest.entidades.Pelicula;

public class PersonajeDetallesDTO {
	
	private String nombre;
	
	private Byte[] imagen;
	

	private int edad;
	
	private double peso;
	
	private String historia;
	
	private Set<Pelicula> peliculas;
	
	
	

	

	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public PersonajeDetallesDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}
	
	

}
