package com.fatecapi.moneymind.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicosbancarios")
public class ServicosBancarios {

    @Column(name = "nome")
    private String nome;

    public ServicosBancarios(String nome){
        this.nome = nome;
    }
    
    public ServicosBancarios(){
        // do nothing
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}

