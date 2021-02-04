package com.example.contracts;

public interface Persona {

	int getId();

	void setId(int id);

	String getNombre();

	void setNombre(String nombre);

	String getApellidos();

	void setApellidos(String apellidos);

	void jubilate();
	
	private String formatea(String value) {
		return value.toUpperCase();
	}

	default String getCompleto() {
		return formatea(getNombre()) + " " + formatea(getApellidos());
	}
	
	static int getEdad(Persona p) {
		// p
		return 0;
	}
}