package com.fatecapi.moneymind.service;

import com.fatecapi.moneymind.entity.Instituicoes;
import com.fatecapi.moneymind.repository.InstituicoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicoesService implements IInstituicoesService{

    @Autowired
    private InstituicoesRepository instituicoesRepo;

    public List<Instituicoes> buscarTodasInstituicoes(){
        return instituicoesRepo.findAll();
    }

	public List<Instituicoes> buscarPorCnpj(Integer cnpj) {
		return instituicoesRepo.buscarPorCnpj(cnpj);
	}
}
