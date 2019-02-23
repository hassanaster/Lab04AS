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

public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_Sequence")
	@SequenceGenerator(name = "alumno_Sequence", sequenceName = "ALUMNO_SEQ")
	private Long idalumno;
	
	@Column(name = "idcurso")
	private Long idcurso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "alumno")
	private List<Alumno> alumnos;
}
