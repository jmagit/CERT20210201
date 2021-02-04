package com.sample.infraestructure.repositories;

import com.sample.contracts.FacturaRepository;
import com.sample.domains.entities.Factura;
import com.sample.infraestructure.UoW.DataBase;

public class FacturaRepositoryImp implements FacturaRepository {
	private DataBase db = new DataBase();
	
	@Override
	public Factura getById(int id) {
		return null;
	}
	@Override
	public void add(Factura item) {
		db.save();
	}
	@Override
	public void modify(Factura item) {
		
	}
	@Override
	public void remove(Factura item) {
		
	}
}
