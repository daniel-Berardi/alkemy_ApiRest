package com.apirest.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="imagenGenero")
	private Byte[] imagen;
	
	private String nombre;
	@OneToMany
	private Set<Pelicula> peliculas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Byte[] getImagen() {
		return imagen;
	}
	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	
	

}
