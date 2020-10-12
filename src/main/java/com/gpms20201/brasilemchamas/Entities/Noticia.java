package com.gpms20201.brasilemchamas.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Noticia {

    public Noticia(String titulo, String corpo, String urlImagem) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.urlImagem = urlImagem;
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

}
