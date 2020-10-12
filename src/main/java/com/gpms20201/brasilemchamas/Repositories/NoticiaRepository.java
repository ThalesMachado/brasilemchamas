package com.gpms20201.brasilemchamas.Repositories;

import com.gpms20201.brasilemchamas.Entities.Noticia;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticiaRepository extends MongoRepository<Noticia, String> {
    public Noticia findByCaminho(String caminho);

}
