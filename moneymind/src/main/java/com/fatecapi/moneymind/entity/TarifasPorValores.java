package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_tarifas_valores")
public class TarifasPorValores {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	
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
	
	public TarifasPorValores() {
	
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getValor_maximo() {
		return valor_maximo;
	}

	public void setValor_maximo(String valor_maximo) {
		this.valor_maximo = valor_maximo;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
}
