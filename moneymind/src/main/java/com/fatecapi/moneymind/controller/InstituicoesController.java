package com.fatecapi.moneymind.controller;


import com.fatecapi.moneymind.entity.Instituicoes;
import com.fatecapi.moneymind.service.IInstituicoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/instituicoes")
public class InstituicoesController {

    @Autowired
    private IInstituicoesService service;

    @GetMapping
    public List<Instituicoes> buscarTodasInstituicoes(){
        return service.buscarTodasInstituicoes();
    }
}
