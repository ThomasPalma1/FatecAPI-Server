package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "listatarifasporvalores")
public class TarifasPorValores {
    @Column(name = "nome")
    private String nome;

    public TarifasPorValores(String nome){
        this.nome = nome;
    }
    
    public TarifasPorValores(){
        // do nothing
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}




