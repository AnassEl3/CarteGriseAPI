package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Vehicule;

@RepositoryRestResource(path = "vehicules", collectionResourceRel = "vehicules")
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
    
}
