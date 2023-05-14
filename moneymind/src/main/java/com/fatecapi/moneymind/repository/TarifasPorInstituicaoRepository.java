package com.fatecapi.moneymind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fatecapi.moneymind.entity.TarifasPorInstituicao;

public interface TarifasPorInstituicaoRepository extends JpaRepository<TarifasPorInstituicao, Long> {
	@Query("SELECT e FROM TarifasPorInstituicao e WHERE e.cnpj = :cnpj AND e.tipoPessoa = :tipoPessoa ORDER BY e.valorMaximo DESC")
	List<TarifasPorInstituicao> buscarTarifasInstituicao(@Param("cnpj") Integer cnpj, @Param("tipoPessoa") String tipoPessoa);
	
	@Query("SELECT e FROM TarifasPorInstituicao e WHERE (e.cnpj = :cnpj1 OR e.cnpj = :cnpj2) AND e.servico = :servico AND e.tipoPessoa = :tipoPessoa")
	List<TarifasPorInstituicao> compararTarifas(
	    @Param("cnpj1") Integer cnpj1,
	    @Param("cnpj2") Integer cnpj2,
	    @Param("servico") String servico,
	    @Param("tipoPessoa") String tipoPessoa
	);
	
	@Query("SELECT e FROM TarifasPorInstituicao e WHERE e.servico = :servico AND e.tipoPessoa = :tipoPessoa AND e.valorMaximo = (SELECT MIN(t.valorMaximo) FROM TarifasPorInstituicao t WHERE t.servico = :servico AND t.tipoPessoa = :tipoPessoa AND t.valorMaximo != 0.0)")
	List<TarifasPorInstituicao> obterMenorTarifa(
	    @Param("servico") String servico,
	    @Param("tipoPessoa") String tipoPessoa
	);


}
