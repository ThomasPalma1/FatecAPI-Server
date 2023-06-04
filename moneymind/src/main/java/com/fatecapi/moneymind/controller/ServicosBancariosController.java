package com.fatecapi.moneymind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecapi.moneymind.entity.ServicosBancarios;
import com.fatecapi.moneymind.service.IServicosBancariosService;
import com.fatecapi.moneymind.service.LogService;

@RestController
@CrossOrigin
@RequestMapping(value = "/servicos")
public class ServicosBancariosController {
	@Autowired
	private IServicosBancariosService service;
    @Autowired
    private LogService logService;
	
	@GetMapping
	public List<ServicosBancarios> buscarTodosServicos(){
    	logService.log("GET", "/servicos", "Busca por todos os serviços");
		return service.buscarTodosServicos();
	}
}
