package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface CursoRepositorio extends CrudRepository<Curso,Long>{
	List<Curso> findByAlumnos(long alumnoId);
}
