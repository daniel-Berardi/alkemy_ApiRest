package com.apirest.modelDTO;



public class PeliculaDTO {
	
	
	

	private String name;
	
	private String fechaCreacion;
	

	private Byte[] imagen;
	
	
	


	public PeliculaDTO() {
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


	public Byte[] getImagen() {
		return imagen;
	}


	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}
	
	
	

}
