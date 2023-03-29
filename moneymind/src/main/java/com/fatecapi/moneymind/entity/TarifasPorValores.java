package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TarifasPorValores {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="razao_social")
	private String razao_social;
	
	@Column(name="valor_maximo")
	private String valor_maximo;
	
	@Column(name="periodicidade")
	private String periodicidade;
	
	@Column(name="servico")
	private String servico;
	
	@Column(name="grupo")
	private String grupo;
}
