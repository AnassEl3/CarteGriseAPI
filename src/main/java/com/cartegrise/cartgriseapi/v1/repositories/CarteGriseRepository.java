package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartegrise.cartgriseapi.v1.models.CarteGrise;

public interface CarteGriseRepository extends JpaRepository<CarteGrise, Long> {
    
}
