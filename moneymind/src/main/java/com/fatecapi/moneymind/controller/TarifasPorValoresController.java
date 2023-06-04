package com.fatecapi.moneymind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatecapi.moneymind.entity.TarifasPorValores;
import com.fatecapi.moneymind.service.LogService;
import com.fatecapi.moneymind.service.TarifasPorValoresService;

@RestController
@CrossOrigin
@RequestMapping(value="/tarifasValores")
public class TarifasPorValoresController {

	@Autowired
	private TarifasPorValoresService service;

    @Autowired
    private LogService logService;
	
	@GetMapping
	public List<TarifasPorValores> buscarTodasTarifas() {
    	logService.log("GET", "/tarifasValores", "Busca por todas tarifas");
		return service.buscarTodasTarifas();
	}
	
	@GetMapping("/bancosMaioresTarifas")
	public List<TarifasPorValores> buscarMaioresTarifas(@RequestParam("grupo") String grupo, @RequestParam("servico") String servico){
    	logService.log("GET", "/tarifasValores/bancosMaioresTarifas", "Busca por bancos maiores tarifas");
		return service.buscarMaioresTarifas(grupo, servico);
	}
	@GetMapping("/bancosMenoresTarifas")
	public List<TarifasPorValores> buscarMenoresTarifas(@RequestParam("grupo") String grupo, @RequestParam("servico") String servico){
    	logService.log("GET", "/tarifasValores/bancosMenoresTarifas", "Busca por bancos menores tarifas");
		return service.buscarMenoresTarifas(grupo, servico);
	}
	
}
