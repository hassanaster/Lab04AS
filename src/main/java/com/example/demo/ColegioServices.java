package com.example.demo;

import java.util.List;

public interface ColegioServices {
	
	public List<String> getAllCursoAlumnos(long courseId);
	public void addAlumnoToCurso(String nombre, String telefono, String direccion, String descripcion, Long courseId);
	public String getCurso(Long CursoId);
}
