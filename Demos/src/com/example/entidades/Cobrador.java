package com.example.entidades;

public class Cobrador extends Factura implements Persona {

	public Cobrador(int numFactura) {
		super(numFactura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return getNumFactura();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jubilate() {
		// TODO Auto-generated method stub
		
	}

}
