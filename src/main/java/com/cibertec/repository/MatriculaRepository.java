package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

	@Query("select a from Matricula a where a.idCurso = ?1")
	public List<Matricula>  listaMatricula(int idCurso);
	
}
