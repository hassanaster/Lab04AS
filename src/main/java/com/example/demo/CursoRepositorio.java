package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CursoRepositorio extends CrudRepository<Curso,Long>{
	Curso findByAlumnos(long alumnoId);
}
