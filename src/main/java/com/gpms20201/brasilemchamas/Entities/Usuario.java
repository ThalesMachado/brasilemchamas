package com.gpms20201.brasilemchamas.Entities;

import java.sql.Date;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
    @Id
    private String Id;
    @Indexed(unique = true)
    private String email;
    private String nome;
    private Date dataNascimento;
    @DBRef
    private Collection<FaleConosco> mensagens;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public Collection<FaleConosco> getMensagens() {
        return mensagens;
    }

}
