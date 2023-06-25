package com.cibertec.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "banco")
public class Banco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_banco;
	private String nombre_banco;
	
	public Banco(Integer id_banco, String nombre_banco) {
		super();
		this.id_banco = id_banco;
		this.nombre_banco = nombre_banco;
	}

	public Banco() {
		
	}

	public Banco(String nombre_banco) {
		super();
		this.nombre_banco = nombre_banco;
	}
	
}
