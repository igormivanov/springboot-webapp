package com.estudo.springweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.estudo.springweb.models.Administrador;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{

	// Também chamada de classe de SERVICE
	
}
