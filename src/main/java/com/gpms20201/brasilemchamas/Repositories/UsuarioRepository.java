package com.gpms20201.brasilemchamas.Repositories;

import com.gpms20201.brasilemchamas.Entities.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    public Usuario findByEmail(String email);
}
