package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Matricula;
import com.cibertec.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository repository;

	@Override
	public List<Matricula> listaMatricula() {
		return repository.findAll();
	}

	@Override
	public Matricula insertaMatricula(Matricula obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Matricula> buscaMatricula(int idMatricula) {
		return repository.findById(idMatricula);
	}

	@Override
	public void eliminaMatricula(int idMatricula) {
		repository.deleteById(idMatricula);
	}

	@Override
	public List<Matricula> listaMatriculaPorCurso(int idCurso) {
		return repository.listaMatricula(idCurso);
	}

}