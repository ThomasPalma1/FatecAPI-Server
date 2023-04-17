package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_tarifas_instituicao")
public class TarifasPorInstituicao {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	
	@Column(name="servico")
	private String servico;
	
	@Column(name = "nomeServico")
	private String nomeServico;
	
	@Column(name="tipoPessoa")
	private String tipoPessoa;
	
	@Column(name="cnpj")
	private Integer cnpj;
	
	@Column(name="unidade")
	private String unidade;
	
	@Column(name="dataVigencia")
	private String dataVigencia;
	
	@Column(name="valorMaximo")
	private Float valorMaximo;
	
	@Column(name="tipoValor")
	private String tipoValor;
	
	@Column(name="periodicidade")
	private String periodicidade;
	
	public TarifasPorInstituicao() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public Float getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(Float valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public String getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
