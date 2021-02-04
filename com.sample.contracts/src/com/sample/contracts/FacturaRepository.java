package com.sample.contracts;

import com.sample.domains.entities.Factura;

public interface FacturaRepository {

	Factura getById(int id);

	void add(Factura item);

	void modify(Factura item);

	void remove(Factura item);

}