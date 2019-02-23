package com.example.demo;

import java.util.List;

public interface ColegioServices {
	
	public List<String> getAllCourseStudents(long courseId);
	public void addStudentToCourse(String nombre, String telefono, String direccion, String descripcion, Long courseId);
}
