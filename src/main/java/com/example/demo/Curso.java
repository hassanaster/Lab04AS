package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_Sequence")
	@SequenceGenerator(name = "curso_Sequence", sequenceName = "CURSO_SEQ")
	private Long idcurso;
	
	@Column(name = "idprofesor")
	private Long idprofesor;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "curso")
	private List<Curso> cursos;
}
