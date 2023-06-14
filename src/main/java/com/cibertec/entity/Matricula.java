package com.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	private int idMatricula;

	private int idAlumno;

	private int idCurso;
	

}
