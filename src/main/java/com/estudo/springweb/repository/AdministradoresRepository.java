package com.estudo.springweb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.estudo.springweb.models.Administrador;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{

	// Também chamada de classe de SERVICE
	
	@Query(value="select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END from administradores where id = :id", nativeQuery = true)
	public boolean exist(int id);
	
}
