package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface MateriaRepositorio extends CrudRepository<Materia, Long> {
	    List<Materia> findByProfesor(long profesorId);
	}


