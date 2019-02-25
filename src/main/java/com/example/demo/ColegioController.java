package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping(path = "/colegioController")	

public class ColegioController {
	@Autowired
	private ColegioServices colegioServices;
	
	@Autowired
	private AlumnoRepositorio Arepositorio;
	
	@Autowired
	private CursoRepositorio Crepositorio;
	
	@PostMapping("/curso")
	ResponseEntity<?>course(@RequestBody Curso curso,UriComponentsBuilder	ucBuilder){
		
		Crepositorio.save(curso);
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(ucBuilder.path("/colegioController/curso/{id}").buildAndExpand(curso.getId()).toUri());
		
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	@GetMapping(path = "/all/{id}")
	public @ResponseBody Iterable<String> getAllUsers(@PathVariable("id") Long cursoId){
		
		return colegioServices.getAllCursoAlumnos(cursoId);
	}
}
