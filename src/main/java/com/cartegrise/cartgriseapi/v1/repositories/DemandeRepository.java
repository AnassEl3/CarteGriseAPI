package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Demande;
@RepositoryRestResource(path = "demandes", collectionResourceRel = "demandes")
public interface DemandeRepository extends JpaRepository<Demande,Long> {
    
}
