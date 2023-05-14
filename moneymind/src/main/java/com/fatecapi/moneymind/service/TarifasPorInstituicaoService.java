package com.fatecapi.moneymind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecapi.moneymind.entity.TarifasPorInstituicao;
import com.fatecapi.moneymind.repository.TarifasPorInstituicaoRepository;

@Service
public class TarifasPorInstituicaoService implements ITarifasPorInstituicaoService {
	@Autowired
	private TarifasPorInstituicaoRepository tarifasRepo;

	@Override
	public List<TarifasPorInstituicao> buscarTarifasInstituicao(Integer cnpj, String tipoPessoa) {
		return tarifasRepo.buscarTarifasInstituicao(cnpj, tipoPessoa);
	}

	@Override
	public List<TarifasPorInstituicao> listarTodos() {
		return tarifasRepo.findAll();
	}

	@Override
	public List<TarifasPorInstituicao> compararTarifas(Integer cnpj1, Integer cnpj2, String servico,
			String tipoPessoa) {

		return tarifasRepo.compararTarifas(cnpj1, cnpj2, servico, tipoPessoa);
	}

	@Override
	public List<TarifasPorInstituicao> obterMenorTarifa(String servico, String tipoPessoa) {
		return tarifasRepo.obterMenorTarifa(servico, tipoPessoa);
	}
}
