package com.estudo.springweb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.estudo.springweb.models.Administrador;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer> {
	  @Query(value="select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from administradores where id = :id", nativeQuery = true)
	  public boolean exist(int id);

	  @Query(value="select * from administradores where email = :email and senha = :senha", nativeQuery = true)
	  public Administrador Login(String email, String senha);
	  
	  //@Query(value="select * from administradores where nome like %:nome% or email like %:email% ", nativeQuery = true)
		//public ArrayList<Administrador> findAllByNomeEmail(@Param("nome") String nome, @Param("email") String email);
	}
