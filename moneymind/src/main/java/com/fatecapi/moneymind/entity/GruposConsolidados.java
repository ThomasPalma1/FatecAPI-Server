package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "gruposconsolidados")
public class GruposConsolidados {
    @Column(name = "nome")
    private String nome;

    public GruposConsolidados(String nome){
        this.nome = nome;
    }

    public GruposConsolidados(){
        //do nothing
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
