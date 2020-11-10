package com.gpms20201.brasilemchamas.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("noticia")
public class Noticia {

    public Noticia(String titulo, String corpo, String urlImagem, String caminho) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.urlImagem = urlImagem;
        this.caminho = caminho;
    }

    @Id
    private String Id;

    private String titulo;
    private String corpo;
    private String urlImagem;
    @Indexed(unique = true)
    private String caminho;

    public String getTitulo() {
        return this.titulo;
    }

    public String getCorpo() {
        return this.corpo;
    }

    public String getURLImagem() {
        return this.urlImagem;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getId() {
        return Id;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
