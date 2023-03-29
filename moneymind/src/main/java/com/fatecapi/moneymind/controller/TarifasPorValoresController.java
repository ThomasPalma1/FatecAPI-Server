package com.fatecapi.moneymind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatecapi.moneymind.entity.TarifasPorValores;
import com.fatecapi.moneymind.service.TarifasPorValoresService;

@RestController
@CrossOrigin
@RequestMapping(value="/tarifasvalores")
public class TarifasPorValoresController {

	@Autowired
	private TarifasPorValoresService service;
	
	@GetMapping("/my-entities")
	public List<TarifasPorValores> TarifasServicoEGrupo(@RequestParam("grupo") String grupo, @RequestParam("servico") String servico){
		return service.buscarTarifasServicoEGrupo(grupo, servico);
	}
	
}
