package com.gpms20201.brasilemchamas.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("faleConosco")
public class FaleConosco {

    public FaleConosco(String nome, String email, String mensagem, String tipoMensagem, String celular) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
        this.tipoMensagem = tipoMensagem;
        this.celular = celular;
    }

    @Id
    private String Id;
    private String nome;
    private String email;
    private String mensagem;
    private String tipoMensagem;
    private String celular;

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

    public String getTipoMensagem() {
        return tipoMensagem;
    }

    public String getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoMensagem(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
