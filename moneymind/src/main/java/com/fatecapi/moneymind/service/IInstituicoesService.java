package com.fatecapi.moneymind.service;

import com.fatecapi.moneymind.entity.Instituicoes;

import java.util.List;

public interface IInstituicoesService {

	public List<Instituicoes> buscarPorCnpj(Integer cnpj);
    public List<Instituicoes> buscarTodasInstituicoes();
}
