package com.fatecapi.moneymind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fatecapi.moneymind.entity.TarifasPorValores;

public interface TarifasPorValoresRepository extends JpaRepository<TarifasPorValores, Long> {
	@Query("SELECT e FROM TarifasPorValores e WHERE e.grupo = :grupo AND e.servico = :servico ORDER BY e.valor_maximo DESC LIMIT 10")
	List<TarifasPorValores> buscarTarifasServicoEGrupo(@Param("grupo") String grupo, @Param("servico") String servico);
}
