module com.sample.infraestructure {
	requires com.sample.domains.entities;
	requires com.sample.contracts;
	
	exports com.sample.infraestructure.repositories to com.sample.domains;

	provides com.sample.contracts.FacturaRepository with com.sample.infraestructure.repositories.FacturaRepositoryImp;
}