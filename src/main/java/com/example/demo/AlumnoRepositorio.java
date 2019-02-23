package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends CrudRepository<Alumno, Long> {
    List<Alumno> findByCursoIdcurso(long CursoIdcurso);
}
