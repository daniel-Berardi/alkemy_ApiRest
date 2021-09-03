package com.apirest.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String fechaCreacion;
	
	private int calificacion;
	@Column(name="imagenPelicula")
	private Byte[] imagen;
	
	
	@ManyToMany
	@JsonIgnore
	private Set<Personaje> personajes;
	@OneToOne
	private Genero genero;
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
