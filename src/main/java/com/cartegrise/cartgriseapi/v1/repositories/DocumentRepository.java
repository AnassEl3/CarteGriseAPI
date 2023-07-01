package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Document;

@RepositoryRestResource(path = "documents", collectionResourceRel = "documents")
public interface DocumentRepository extends JpaRepository<Document, Long> {
    
}
