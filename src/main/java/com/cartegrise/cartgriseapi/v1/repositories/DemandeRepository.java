package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Demande;
@RepositoryRestResource(path = "demandes", collectionResourceRel = "demandes")
public interface DemandeRepository extends CrudRepository<Demande,Long> {
    
}
