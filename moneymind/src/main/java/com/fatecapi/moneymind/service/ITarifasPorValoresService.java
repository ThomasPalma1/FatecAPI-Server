package com.fatecapi.moneymind.service;

import java.util.List;

import com.fatecapi.moneymind.entity.TarifasPorValores;

public interface ITarifasPorValoresService {
	public List<TarifasPorValores> buscarMaioresTarifas(String CodigoGrupo, String CodigoServico);
	public List<TarifasPorValores> buscarMenoresTarifas(String CodigoGrupo, String CodigoServico);
}
