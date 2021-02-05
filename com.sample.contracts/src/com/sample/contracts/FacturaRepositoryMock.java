package com.sample.contracts;

import com.sample.domains.entities.Factura;

public class FacturaRepositoryMock implements FacturaRepository {
	public void test() {
		System.out.println("Soy un doble de prueba");
	}

	@Override
	public Factura getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Factura item) {
		System.out.println("Soy un doble de prueba");

	}

	@Override
	public void modify(Factura item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Factura item) {
		// TODO Auto-generated method stub

	}

}
