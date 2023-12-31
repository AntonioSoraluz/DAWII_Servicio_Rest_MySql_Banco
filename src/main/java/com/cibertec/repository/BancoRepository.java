package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer>{

}
