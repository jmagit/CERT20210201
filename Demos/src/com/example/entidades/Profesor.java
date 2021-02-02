package com.example.entidades;

import java.io.Serializable;

import com.example.Grafico;

public class Profesor extends Persona implements Grafico, Serializable {
	private static final long serialVersionUID = 2L;
	
	private transient boolean cargado = false;
	private transient String cache;
	
	Profesor(int id, String nombre) {
		super(id);
		// ...
	}
	Profesor(int id) {
		this(id, "Anonimo");
	}
	private Profesor() {
		this(0);
	}
	public int getAlgo(String cache) {
		super.getAlgo(cache);
		this.cache = cache;
		if(!cargado) {
			// ... load
			cargado = true;
		}
		int rslt = 0;
		// calcula
		return rslt;
	}
	public static Profesor dameProfesorById(int id) {
		var p = new Profesor();
		p.cargado = true;
		return p;
		
	}
}
