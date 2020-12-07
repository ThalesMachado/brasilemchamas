package com.gpms20201.brasilemchamas.templates;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class FocoQueimadasTemplate {
    @Autowired
    private MongoTemplate mongoTemplate;

    private Map<String, List<String>> getEstadosCidades() {
        Map<String, List<String>> estadosCidades = new HashMap<String, List<String>>();
        MongoCollection<org.bson.Document> focoQueimadasColl = mongoTemplate.getCollection("focoqueimadas");
        AggregateIterable<org.bson.Document> documentos = focoQueimadasColl
                .aggregate(Arrays.asList(
                        new Document("$group",
                                new Document("_id",
                                        new Document("estado", "$estado").append("municipio", "$municipio"))),
                        new Document("$sort", new Document("_id.municipio", 1L)),
                        new Document("$group",
                                new Document("_id", "$_id.estado").append("municipios",
                                        new Document("$push", "$_id.municipio"))),
                        new Document("$sort", new Document("_id", 1L))));
        for (org.bson.Document documento : documentos) {
            estadosCidades.put(String.valueOf(documento.get("_id")), (List<String>) documento.get("municipios"));
        }
        return estadosCidades;
    }

}
