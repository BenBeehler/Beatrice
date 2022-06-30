package com.benbeehler.beatrice.entities;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import static io.micronaut.data.annotation.GeneratedValue.Type.UUID;

/**
 * Content object that represents individual post entities.
 * @author Benjamin Beehler
 */
@MappedEntity 
public class ContentEntity {

    @Id
    @GeneratedValue(UUID)
    private String id;

    @NotNull
    private String title;

    @NotNull
    private AuthorEntity author;

    public ContentEntity(@NotNull String title, @NotNull String authorId) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public AuthorEntity getAuthor() {
        return this.author;
    }
}