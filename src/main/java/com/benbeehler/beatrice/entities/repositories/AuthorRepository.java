package com.benbeehler.beatrice.entities.repositories;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

import com.benbeehler.beatrice.entities.AuthorEntity;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@JdbcRepository(dialect = POSTGRES) 
public interface AuthorRepository extends CrudRepository<AuthorEntity, String> { 

    Optional<AuthorEntity> findByUsername(String username); 

    Collection<AuthorEntity> findByIdIn(Collection<String> ids); 

    default AuthorEntity findOrCreate(String username) { 
        return findByUsername(username).orElseGet(() -> save(new AuthorEntity(username)));
    }
}
