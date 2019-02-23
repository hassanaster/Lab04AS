package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ColegioServiceImpl {
	@Autowired
	private AlumnoRepositorio Arepositorio;
	
	@Autowired
	private CursoRepositorio Crepositorio;
	
	public List<String> getAllCourseStudents(long cursoId){
		List<String> result = new ArrayList<String>();
		List<Alumno> alumnos = Arepositorio.findByCursoIdcurso(cursoId);
		for(Alumno alumno : alumnos) {
			result.add(alumno.getNombre());
		}
		return result;
	}
	
	public void addStudentToCourse(String nombre, String telefono, String direccion, String descripcion, Long cursoId) {
		Curso curso = Crepositorio.findById(cursoId).get(); 
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setTelefono(telefono);
		alumno.setDireccion(direccion);
		alumno.setDescripcion(descripcion);
		Arepositorio.save(alumno);
	}
}
