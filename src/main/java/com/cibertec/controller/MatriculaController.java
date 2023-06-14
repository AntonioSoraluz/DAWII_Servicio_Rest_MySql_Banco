package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Matricula;
import com.cibertec.service.MatriculaService;

@RestController
@RequestMapping("/rest/matricula")
public class MatriculaController {

	@Autowired
	private MatriculaService service;

	@GetMapping("/porCurso/{id}")
	public ResponseEntity<?> listaPorCurso(@PathVariable("id") int idCurso) {
		List<Matricula> lstSalida = service.listaMatriculaPorCurso(idCurso);
		return ResponseEntity.ok(lstSalida);
	}

	@GetMapping()
	public ResponseEntity<?> lista() {
		List<Matricula> lstSalida = service.listaMatricula();
		return ResponseEntity.ok(lstSalida);
	}
	
	@PostMapping
	public ResponseEntity<?> inserta(@RequestBody Matricula obj) {
		Matricula objSalida = service.insertaMatricula(obj);
		return ResponseEntity.ok(objSalida);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminaMatricula(@PathVariable Integer id) {
		service.eliminaMatricula(id);
		Optional<Matricula> optMatricula = service.buscaMatricula(id);
		if (optMatricula.isEmpty()) {
			return ResponseEntity.ok("Eliminación exitosa");
		}
		return ResponseEntity.ok("No existe el id " + id);
	}

	@PutMapping
	public ResponseEntity<?> actualiza(@RequestBody Matricula obj) {
		Optional<Matricula> optMatricula = service.buscaMatricula(obj.getIdMatricula());
		if (optMatricula.isPresent()) {
			Matricula objSalida = service.insertaMatricula(obj);
			return ResponseEntity.ok(objSalida);
		} else {
			return ResponseEntity.ok("El Matricula no existe");
		}
	}
}
