package com.sample.domains.services;

import com.sample.contracts.FacturaRepository;
import com.sample.domains.entities.Factura;
import com.sample.infraestructure.repositories.FacturaRepositoryImp;

public class FacturaService {
	private FacturaRepository dao = new FacturaRepositoryImp();
	
	public void add(Factura item) {
		// ... validate
		dao.add(item);
	}
}
