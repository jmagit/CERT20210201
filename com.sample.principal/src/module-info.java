module com.sample.principal {
	requires com.sample.domains.entities;
	requires com.sample.contracts;
	requires transitive com.sample.domains;
	
	uses com.sample.contracts.FacturaRepository;
}