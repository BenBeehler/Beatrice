package com.benbeehler.beatrice.entities.repositories;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.PageableRepository;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

import com.benbeehler.beatrice.entities.AuthorEntity;

@JdbcRepository(dialect = POSTGRES) 
public interface ContentRepository extends PageableRepository<AuthorEntity, String> {
    
}
