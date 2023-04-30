package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Document;

@RepositoryRestResource(path = "documents", collectionResourceRel = "documents")
public interface DocumentRepository extends CrudRepository<Document, Long> {
    
}
