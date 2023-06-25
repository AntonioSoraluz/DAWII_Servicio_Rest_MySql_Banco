package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Banco;
import com.cibertec.service.BancoService;

@RestController
@RequestMapping("/rest/bancos")
@CrossOrigin(origins = "http://localhost:4200")
public class BancoController {

	@Autowired
	private BancoService service;

	@GetMapping()
	public ResponseEntity<?> lista() {
		List<Banco> lstSalida = service.listaBanco();
		return ResponseEntity.ok(lstSalida);
	}
}
