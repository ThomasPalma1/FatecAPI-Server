package com.fatecapi.moneymind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecapi.moneymind.entity.GruposConsolidados;
import com.fatecapi.moneymind.repository.GruposConsolidadosRepository;

@Service
public class GruposConsolidadosService implements IGruposConsolidadosService{
	@Autowired
	private GruposConsolidadosRepository grupoRepo;
	
	public List<GruposConsolidados> buscarTodosGrupos() {
		return grupoRepo.findAll();
	}
}
