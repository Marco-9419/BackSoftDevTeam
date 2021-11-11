package com.softdevteam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rfc;
	private String nombre;
	private String apellido;
	private Long numero;
	
	public Persona() {
		
	}
	
	// Crear constructor de variables 
	public Persona(Long id,String rfc, String nombre, String apellido, Long numero) {
		this.id = id;
		this.rfc = rfc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		
	}
	
	 //Setters y Getters
	
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	
	

}
