module com.sample.contracts {
	requires com.sample.domains.entities;
	
	exports com.sample.contracts;
	
	provides com.sample.contracts.FacturaRepository with com.sample.contracts.FacturaRepositoryMock;
}