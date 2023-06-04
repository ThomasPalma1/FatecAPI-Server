package com.fatecapi.moneymind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatecapi.moneymind.entity.TarifasPorInstituicao;
import com.fatecapi.moneymind.service.LogService;
import com.fatecapi.moneymind.service.TarifasPorInstituicaoService;

@RestController
@CrossOrigin
@RequestMapping(value="/tarifasInstituicao")
public class TarifasPorInstituicaoController {

	@Autowired
	private TarifasPorInstituicaoService service;
    @Autowired
    private LogService logService;
	
	@GetMapping("/buscarTarifasInstituicao")
	public List<TarifasPorInstituicao> buscarTarifasInstituicao(@RequestParam("cnpj") Integer cnpj, @RequestParam("tipoPessoa") String tipoPessoa){
    	logService.log("GET", "/tarifasInstituicao/buscarTarifasInstituicao", "Busca por todos os serviços");
		return service.buscarTarifasInstituicao(cnpj, tipoPessoa);
	}
	
	@GetMapping("/comparadorTarifas")
	public List<TarifasPorInstituicao> compararTarifas(@RequestParam("cnpj1") Integer cnpj1,@RequestParam("cnpj2") Integer cnpj2, @RequestParam("servico") String servico, @RequestParam("tipoPessoa") String tipoPessoa){
    	logService.log("GET", "/buscarTarifasInstituicao/comparadorTarifas", "Busca para realizar comparador entre tarifas");
		return service.compararTarifas(cnpj1, cnpj2, servico, tipoPessoa);
	}
	
	@GetMapping("/menorTarifa")
	public List<TarifasPorInstituicao> obterMenorTarifa (@RequestParam("servico") String servico, @RequestParam("tipoPessoa") String tipoPessoa) {
    	logService.log("GET", "/tarifasInstituicao/menorTarifa", "Buscar menor tarifa");
		return service.obterMenorTarifa(servico, tipoPessoa);
	}
	
	@GetMapping
	public List<TarifasPorInstituicao> listarTodos(){
    	logService.log("GET", "/tarifasInstituicao", "Tarifas por instituições");
		return service.listarTodos();
	}
}
