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
}
