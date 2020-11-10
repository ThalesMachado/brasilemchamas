package com.gpms20201.brasilemchamas.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FaleConosco {

    public FaleConosco(String nome, String email, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
    }

    @Id
    private String Id;
    private String nome;
    private String email;
    private String mensagem;

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

}
