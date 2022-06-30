package com.benbeehler.beatrice.entities;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import static io.micronaut.data.annotation.GeneratedValue.Type.UUID;

import javax.validation.constraints.NotNull;

/**
 * Author object that represents individual author entities.
 * @author Benjamin Beehler
 */
@MappedEntity
public class AuthorEntity {

    @Id
    @GeneratedValue(UUID)
    private String id;
    
    private String name;
    private String imgURI;

    public AuthorEntity(@NotNull String name) {
        this.name = name;    
    }

    public String getId() {
        return this.id;
    }    

    public String getName() {
        return this.name;
    }    

    public void setImgURI(String imgURI) {
        this.imgURI = imgURI;
    }

    public String getImgURI() {
        return this.imgURI;
    }
}
