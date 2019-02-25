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
	
	public List<String>  getAllCursoAlumnos(long cursoId){
		List<String> result = new ArrayList<String>();
		List<Alumno> alumnos = Arepositorio.findByCursoIdcurso(cursoId);
		for(Alumno alumno : alumnos) {
			result.add(alumno.getNombre());
		}
		return result;
	}
	
	public void addAlumnoToCurso(String nombre, String telefono, String direccion, String descripcion, Long cursoId) {
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setTelefono(telefono);
		alumno.setDireccion(direccion);
		alumno.setDescripcion(descripcion);
		Arepositorio.save(alumno);
	}
	
	public String getCurso(Long cursoId) {
		return Crepositorio.findById(cursoId).get().getNombre();
	}
	

}
