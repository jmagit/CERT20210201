package com.sample;

import java.util.ServiceLoader;

import com.sample.contracts.FacturaRepository;
import com.sample.domains.entities.Factura;
import com.sample.domains.services.FacturaService;

public class Principal {

	public static void main(String[] args) {
//		FacturaService srv = new FacturaService();
//		
//		srv.add(new Factura());
		ServiceLoader<FacturaRepository> services = ServiceLoader.load(FacturaRepository.class);
		services.forEach(s -> s.add(null));

	}

}
