package com.gpms20201.brasilemchamas.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gpms20201.brasilemchamas.Entities.FocoQueimadas;
import com.gpms20201.brasilemchamas.Models.FocoQueimadasModel;
import com.gpms20201.brasilemchamas.Repositories.FocoQueimadasRepository;
import com.mongodb.client.AggregateIterable;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fq")
public class FocoQueimadasController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private FocoQueimadasRepository fqRepository;

    @GetMapping("/estados")
    public List<String> listaEstados() {
        List<String> estados = new ArrayList<String>();
        AggregateIterable<org.bson.Document> estadosAgg = mongoTemplate.getCollection("focoqueimadas")
                .aggregate(Arrays.asList(new Document("$group", new Document("_id", "$estado")),
                        new Document("$sort", new Document("_id", 1L))));
        for (Document document : estadosAgg) {
            estados.add(String.valueOf(document.get("_id")));
        }

        return estados;
    }

    @GetMapping("/cidades/{estado}")
    public List<String> listaCidadesEstado(@PathVariable("estado") String estado) {
        List<String> cidades = new ArrayList<String>();
        AggregateIterable<org.bson.Document> cidadesAgg = mongoTemplate.getCollection("focoqueimadas")
                .aggregate(Arrays.asList(new Document("$match", new Document("estado", estado)),
                        new Document("$group", new Document("_id", "$municipio")),
                        new Document("$sort", new Document("_id", 1L))));
        for (Document document : cidadesAgg) {
            cidades.add(String.valueOf(document.get("_id")));
        }
        return cidades;
    }
}
