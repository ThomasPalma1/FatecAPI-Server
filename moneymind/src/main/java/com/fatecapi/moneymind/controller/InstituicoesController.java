package com.fatecapi.moneymind.controller;


import com.fatecapi.moneymind.entity.Instituicoes;
import com.fatecapi.moneymind.service.IInstituicoesService;
import com.fatecapi.moneymind.service.LogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/instituicoes")
public class InstituicoesController {

    @Autowired
    private IInstituicoesService service;
    @Autowired
    private LogService logService;

    @GetMapping
    public List<Instituicoes> buscarTodasInstituicoes(){
    	logService.log("GET", "/instituicoes", "Busca por todas as instituições");
        return service.buscarTodasInstituicoes();
    }
    
    @GetMapping("/buscarPorCnpj")
    public List<Instituicoes> buscarPorCnpj(@RequestParam("cnpj") Integer cnpj) {
    	logService.log("GET", "/instituicoes/buscarPorCnpj?cnpj=" + cnpj, "Busca por CNPJ: " + cnpj);
    	return service.buscarPorCnpj(cnpj);
    }
}
