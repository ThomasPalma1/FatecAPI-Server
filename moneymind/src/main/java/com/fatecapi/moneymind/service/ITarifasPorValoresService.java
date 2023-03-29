package com.fatecapi.moneymind.service;

import java.util.List;

import com.fatecapi.moneymind.entity.TarifasPorValores;

public interface ITarifasPorValoresService {
	public List<TarifasPorValores> buscarTarifasServicoEGrupo(String CodigoGrupo, String CodigoServico);
}
