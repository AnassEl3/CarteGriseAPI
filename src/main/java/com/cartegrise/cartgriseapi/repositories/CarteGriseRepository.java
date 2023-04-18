package com.cartegrise.cartgriseapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.models.CarteGrise;

@RepositoryRestResource
public interface CarteGriseRepository extends JpaRepository<CarteGrise, Long> {
    
}
