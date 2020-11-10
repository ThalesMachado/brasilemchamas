package com.gpms20201.brasilemchamas.Repositories;

import com.gpms20201.brasilemchamas.Entities.FaleConosco;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FaleConoscoRepository extends MongoRepository<FaleConosco, String> {
    public FaleConosco findByEmail(String email);

}
