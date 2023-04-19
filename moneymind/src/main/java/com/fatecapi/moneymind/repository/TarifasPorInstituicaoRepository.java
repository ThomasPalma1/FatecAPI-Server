package com.fatecapi.moneymind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fatecapi.moneymind.entity.TarifasPorInstituicao;

public interface TarifasPorInstituicaoRepository extends JpaRepository<TarifasPorInstituicao, Long> {
	@Query("SELECT e FROM TarifasPorInstituicao e WHERE e.cnpj = :cnpj AND e.tipoPessoa = :tipoPessoa ORDER BY e.valorMaximo DESC")
	List<TarifasPorInstituicao> buscarTarifasInstituicao(@Param("cnpj") Integer cnpj, @Param("tipoPessoa") String tipoPessoa);
}
