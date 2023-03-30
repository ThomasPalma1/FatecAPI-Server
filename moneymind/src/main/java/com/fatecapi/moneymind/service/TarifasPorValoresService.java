package com.fatecapi.moneymind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecapi.moneymind.entity.TarifasPorValores;
import com.fatecapi.moneymind.repository.TarifasPorValoresRepository;

@Service
public class TarifasPorValoresService implements ITarifasPorValoresService{
	@Autowired
	private TarifasPorValoresRepository tarifasRepo;
	
	public List<TarifasPorValores> buscarTarifasServicoEGrupo(String CodigoGrupo, String CodigoServico){
		return tarifasRepo.buscarTarifasServicoEGrupo(CodigoGrupo, CodigoServico);
	}
}
