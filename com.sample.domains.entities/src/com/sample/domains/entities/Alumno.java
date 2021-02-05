package com.sample.domains.entities;

public class Alumno extends Persona {

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alumno [id=" + getId() + ", nombre=" + getNombre() + " " + getApellidos() +"]";
	}

}
