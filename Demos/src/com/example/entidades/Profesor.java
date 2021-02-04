package com.example.entidades;

import java.io.Serializable;

import com.example.Grafico;

public class Profesor extends PersonaImp implements Grafico, Serializable {
	private static final long serialVersionUID = 2L;

	//@Override
	public static void sobreescrituraDeMetodosDeClase() {
		System.out.println("Soy el de Profesor");
	}

	private transient boolean cargado = false;
	@SuppressWarnings({"unused", "kk"})
	private transient String cache;
	
	private Factura.Direccion direccion;
	
	public Profesor(int id, String nombre) {
		super(id);
		setId(id);
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
	@Override
	public void pintate() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getCompleto() {
		// TODO Auto-generated method stub
		return getApellidos() + ", " + getNombre();
	}
}
