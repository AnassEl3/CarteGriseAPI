package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.CarteGrise;

@RepositoryRestResource(path = "cartegrises", collectionResourceRel = "cartegrises")
public interface CarteGriseRepository extends CrudRepository<CarteGrise, Long> {
    
}
