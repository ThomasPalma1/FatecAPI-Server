package com.fatecapi.moneymind.repository;

import com.fatecapi.moneymind.entity.Instituicoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InstituicoesRepository extends JpaRepository<Instituicoes, Long> {
	@Query("SELECT e FROM Instituicoes e WHERE e.cnpj = :cnpj")
	List<Instituicoes> buscarPorCnpj(@Param("cnpj") Integer cnpj);
}
