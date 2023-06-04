package com.fatecapi.moneymind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecapi.moneymind.entity.GruposConsolidados;
import com.fatecapi.moneymind.service.IGruposConsolidadosService;
import com.fatecapi.moneymind.service.LogService;

@RestController
@CrossOrigin
@RequestMapping(value = "/grupos")
public class GruposConsolidadosController {
	@Autowired
	private IGruposConsolidadosService service;
    @Autowired
    private LogService logService;
    
	@GetMapping
	public List<GruposConsolidados> buscarTodosGrupos() {
    	logService.log("GET", "/grupos", "Busca por todos os grupos");
		return service.buscarTodosGrupos();
	}
}
