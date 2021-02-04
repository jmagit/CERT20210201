module com.sample.domains {
	requires com.sample.domains.entities;
	requires com.sample.infraestructure;
	requires com.sample.contracts;
	
	exports com.sample.domains.services;
	exports com.sample.domains.exceptions;
}