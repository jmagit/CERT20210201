package com.sample.domains.entities;

public class Profesor extends Persona {

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
	}
	@Override
	public String toString() {
		return "Profesor [id=" + getId() + ", nombre=" + getNombre() + " " + getApellidos() +"]";
	}

}
