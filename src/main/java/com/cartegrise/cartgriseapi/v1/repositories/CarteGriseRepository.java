package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.CarteGrise;

@RepositoryRestResource(path = "cartesgrise", collectionResourceRel = "cartesgrise")
public interface CarteGriseRepository extends JpaRepository<CarteGrise, Long> {
    
}
