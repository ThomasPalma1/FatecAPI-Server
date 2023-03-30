package com.fatecapi.moneymind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecapi.moneymind.entity.ServicosBancarios;
import com.fatecapi.moneymind.repository.ServicosBancariosRepository;

@Service
public class ServicosBancariosService implements IServicosBancariosService{
	@Autowired
	private ServicosBancariosRepository servicoRepo;
	
	public List<ServicosBancarios> buscarTodosServicos() {
		return servicoRepo.findAll();
	}
}
