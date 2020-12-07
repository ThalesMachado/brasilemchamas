package com.gpms20201.brasilemchamas.Repositories;

import java.util.ArrayList;

import com.gpms20201.brasilemchamas.Entities.FocoQueimadas;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FocoQueimadasRepository extends MongoRepository<FocoQueimadas, String> {
}
