package com.fatecapi.moneymind.service;

import java.util.List;

import com.fatecapi.moneymind.entity.TarifasPorInstituicao;

public interface ITarifasPorInstituicaoService {
	public List<TarifasPorInstituicao> buscarTarifasInstituicao(Integer cnpj, String tipoPessoa);
	public List<TarifasPorInstituicao> compararTarifas(Integer cnpj1, Integer cnpj2, String servico, String tipoPessoa);
	public List<TarifasPorInstituicao> obterMenorTarifa(String servico, String tipoPessoa);
	public List<TarifasPorInstituicao> listarTodos();
}
