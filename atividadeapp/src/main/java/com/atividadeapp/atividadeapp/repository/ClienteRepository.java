package com.atividadeapp.atividadeapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.atividadeapp.atividadeapp.modells.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
}
