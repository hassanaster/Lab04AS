package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface ProfesorRepositorio extends CrudRepository<Profesor, Long> {
	    List<Profesor> findByCursoIdprofesor(long CursoIdprofesor);
	}

