package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.entity.Matricula;

public interface MatriculaService {

	public List<Matricula> listaMatricula();

	public List<Matricula> listaMatriculaPorCurso(int idCurso);
	
	public Matricula insertaMatricula(Matricula obj);

	public Optional<Matricula> buscaMatricula(int idCategoria);

	public void eliminaMatricula(int idCategoria);

}
