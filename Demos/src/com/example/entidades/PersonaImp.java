package com.example.entidades;

import java.util.Date;

import com.example.contracts.Persona;

public abstract class PersonaImp implements Persona {
	private int id;
	private String nombre = "Pepito";
	private String apellidos = "Grillo" ;
	private boolean jubilado = false;
	private Date fechaJubilacion;
	
	public static void metodoDeClase() {
		sobreescrituraDeMetodosDeClase();
	}
	public /*final*/ static void sobreescrituraDeMetodosDeClase() {
		System.out.println("Soy el de PersonaImp");
	}
	
	PersonaImp(int id) {
		setId(id);
	}
	
//	PersonaImp() {
//		
//	}
	public int getAlgo(String cache) {
		return 0;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public void jubilate() {
		jubilado = true;
		fechaJubilacion = new Date();		
	}
}
